package compiler.semantic;

import java.util.Hashtable;
import compiler.ast.*;
import java.util.LinkedList;
import compiler.lib.Printer;

public class Tabla {

	public String name;
	int iif=0,ifor=0,iwhile=0;
	public Hashtable<String,Types> tab = new Hashtable<String,Types>();
	public Tabla parent;
	public LinkedList<String> error = new LinkedList<String>();
	public LinkedList<Tabla> hijos = new LinkedList<Tabla>();
	public Tabla(String name,Tabla parent){
		this.name = name;
		this.parent = parent;
		
	}
	public void add(Node n){
		if (n instanceof FieldDec){
			//get tipo
			FieldDec nodo = (FieldDec)n;
			String tipo="";
			if(nodo.v != null){
				tipo = nodo.v;
			}else{
				Type t = (Type) nodo.type;
				tipo = t.id;
			}
			//ids normales
			for(String s : nodo.id){
				if(!tab.containsKey(s)){
					tab.put(s,new Types(tipo));
				}else{
					error.add("ERROR: "+s+" ya existe en: " + name);
				}
			}
			// arreglos
			for(int i = 0;i < nodo.idb.size();i++){
				String s = nodo.idb.get(i);
				s= s.substring(0,s.length()-1);
				if(!tab.containsKey(s)){
					Literal lit = (Literal)nodo.lit.get(i);
					if(lit.lit != null){
						DecLit declit = (DecLit)lit.lit;
						int p = Integer.parseInt(declit.enteros.get(0));
						if(p>0){
							tab.put(s,new Types(tipo,p));
						}else{
							error.add("ERROR: la dimencion del array debe ser mayor a 0");
						}
					}else{
						error.add("ERROR: la dimencion del array debe ser entero mayor a 0");
					}
				}else{
					error.add("ERROR: "+s+" ya existe en: " + name);
				}
			}
			
		}else if (n instanceof MethodDec){
			MethodDec nodo = (MethodDec) n;
			//get tipo del metodo
			String tipo = "";
			if(!nodo.boo){
				Type t = (Type) nodo.type.get(0);
				tipo = t.id;
				//id del metodo
				String id = nodo.id.get(0);
				//argumentos del metodo
				LinkedList<Args> args = new LinkedList<Args>();
				for(int i = 0; i < nodo.id.size();i++){
					Type ti = (Type) nodo.type.get(i);
					args.add(new Args(ti.id,nodo.id.get(i)));
				}
				//agregar a la tabla el metodo
				if(!tab.containsKey(id)){
					tab.put(id,new Types(tipo,args));
				}else{
					error.add("ERROR: "+id+" ya existe en: " + name);
				}

				//crear tabla para el metodo
				Tabla method = new Tabla(id,this);
				method.add(nodo.b);
				hijos.add(method);
			}else{
				tipo = "VOID";
				//id del metodo
				String id = nodo.id.get(0);
				//argumentos del metodo
				LinkedList<Args> args = new LinkedList<Args>();
				for(int i = 1; i < nodo.id.size();i++){
					Type ti = (Type) nodo.type.get(i-1);
					args.add(new Args(ti.id,nodo.id.get(i)));
				}
				//agregar a la tabla el metodo
				if(!tab.containsKey(id)){
					tab.put(id,new Types(tipo,args));
				}else{
					error.add("ERROR: "+id+" ya existe en: " + name);
				}
				//crear tabla para el metodo
				Tabla method = new Tabla(id,this);
				method.add(nodo.b);
				hijos.add(method);
			}

		}else if (n instanceof Callout){
			Callout nodo = (Callout) n;
			if(!tab.containsKey(nodo.id)){
				tab.put(nodo.id,new Types("Callout"));
			}else{
				error.add("ERROR: "+nodo.id+" ya existe en: " + name);
			}
		}else if (n instanceof Block){
			Block nodo = (Block)n;
			//agregando las declaraciones en Block
			for(Node e : nodo.dec){
				this.add(e);
			}
			//agregando los statement en block
			for(Node e : nodo.state){
				this.add(e);
			}
		}else if (n instanceof Root){
			Root nodo = (Root)n;
			//agregando todos los nodos de root
			for(Node e : nodo.list){
				this.add(e);
			}
		}else if (n instanceof Sif){
			Sif nodo = (Sif)n;
			//agregando if a la tabla 
			String id = "IF"+iif;
			if(!tab.containsKey(id)){
				tab.put(id,new Types("IF"));
				iif++;
			}else{
				error.add("ERROR: "+id+" ya existe en: " + name);
			} 
			//creando tabla del if
			Tabla tif = new Tabla(id,this);
			tif.add(nodo.block1);
			hijos.add(tif);
			//si existe else crear su tabla y agregarla a la del if
			if(nodo.block2!=null){
				Tabla telse = new Tabla(id+"ELSE",tif);
				telse.add(nodo.block2);
				tif.hijos.add(tif);
			}

		}else if (n instanceof Sfor){
			Sfor nodo = (Sfor)n;
			//agregando if a la tabla 
			String id = "FOR"+ifor;
			if(!tab.containsKey(id)){
				tab.put(id,new Types("FOR"));
				ifor++;
			}else{
				error.add("ERROR: "+id+" ya existe en: " + name);
			} 
			//creando tabla del for
			Tabla tfor = new Tabla(id,this);
			tfor.add(nodo.block);
			hijos.add(tfor);
		}else if (n instanceof SWhile){
			SWhile nodo = (SWhile)n;
			//agregando if a la tabla 
			String id = "While"+iwhile;
			if(!tab.containsKey(id)){
				tab.put(id,new Types("While"));
				iwhile++;
			}else{
				error.add("ERROR: "+id+" ya existe en: " + name);
			} 
			//creando tabla del for
			Tabla twhile = new Tabla(id,this);
			twhile.add(nodo.block);
			hijos.add(twhile);
		}else if (n instanceof Sasignacion){
			// sacando informacion del nodo
			Sasignacion nodo = (Sasignacion) n;
			Location loc = (Location) nodo.loc;
			AssingOP sig = (AssingOP) nodo.sig;
			//verificando existencia y consiguiendo la tabla donde esta
			Tabla t = getTab(this,loc.id);
			String tipo = t.tab.get(loc.id).type;
			if(t!=null){
				if((sig.op.equals("-=")||sig.op.equals("+="))){
					if(!tipo.equals("int")){
						error.add("ERROR: -= y += solo se aplican a tipo int");
					}
				}
				//verificando tipos
				getType(nodo.exp,tipo,this);
			}else{
				error.add("ERROR: "+loc.id+" no existe");
			}

		}

	}
	public Tabla getTab(Tabla t, String name){
		if (t.parent != null){
			for (String key : t.tab.keySet()) {
				if(key.equals(name)){
					return t;
				}
			}
			return getTab(t.parent,name);		
		}else{
			for (String key : t.tab.keySet()) {
				if(key.equals(name)){
					return t;
				}
			}
			return null;
		}
	}
	public void ifMain(Tabla t){
		Tabla tabla = getTab(t,"main");
		if(tabla==null){
			error.add("debe existir un metodo main");
		}
	}
	public void getType(Node e,String tipo,Tabla t){
		if(e instanceof Exprecion){
			Exprecion n = (Exprecion)e;
			getType(n.exp,tipo,t);
		}else if(e instanceof ExpS){
			ExpS n = (ExpS)e;
			getType(n.exp,tipo,t);
		}else if(e instanceof EBinOP){
			EBinOP n = (EBinOP)e;
			getType(n.exp,tipo,t);
			getType(n.expl,tipo,t);
		}else if(e instanceof Location){
			Location n = (Location)e;
			Tabla tab = getTab(t,n.id);
			if(t!=null){
				String type = tab.tab.get(n.id).type;
				if(!tipo.equals(type)){
					t.error.add("ERROR: tipo incompatible");
					return ;
				}
			}else{
				error.add("ERROR: "+n.id+" no existe");
			}
		}else if(e instanceof MethodCall){
			MethodCall n = (MethodCall)e;
			Tabla tab = getTab(t,n.id);
			if(t!=null){
				String type = tab.tab.get(n.id).type;
				if(!tipo.equals(type)){
					t.error.add("ERROR: tipo incompatible");
					return ;
				}
			}else{
				error.add("ERROR: "+n.id+" no existe");
			}
		}else if(e instanceof Literal){
			Literal n = (Literal)e;
			if(n.s!=null){
				if((n.s.equals("true")||n.s.equals("false"))&&!(tipo.equals("boolean"))){
					t.error.add("ERROR: tipo incompatible");
					return ;
				}else{
					t.error.add("ERROR: tipo incompatible");
					return ;
				}
			}else{
				if(!(tipo.equals("int"))){
					t.error.add("ERROR: tipo incompatible");
					return ;
				}
			}
		}
	}
	public void toString(Printer out,boolean b){
		out.print("\n Name: "+name,b);
		if(parent!=null){
			out.print("Parent: "+parent.name+"\n",b);
		}else{
			out.print("Parent: Null \n",b);
		}
		for (String key : tab.keySet()) {
		    out.print(key + ":" + tab.get(key),b);
		}
		tab.toString();
		for(Tabla t : hijos){
			t.toString(out,b);
		}

	}
}