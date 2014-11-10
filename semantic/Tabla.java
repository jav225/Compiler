package compiler.semantic;

import java.util.Hashtable;
import compiler.ast.*;
import java.util.LinkedList;

public class Tabla {

	public String name;
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
					error.add("ERROR: "+s+" ya existe");
				}
			}
			// arreglos
			for(int i = 0;i < nodo.idb.size();i++){
				String s = nodo.idb.get(i);
				s= s.substring(0,s.length()-1);
				if(!tab.containsKey(s)){
					Literal lit = (Literal)nodo.lit.get(i);
					if(lit.lit != null){
						int j = Integer.parseInt(lit.s);
						tab.put(s,new Types(tipo,j));
					}else{
						Literal intlit = (Literal)lit.lit;
						int j = Integer.parseInt(intlit.s);
						if(intlit.lit != null){
							tab.put(s,new Types(tipo,j));
						}else{
							DecLit declit = (DecLit)intlit.lit;
							int p = Integer.parseInt(declit.enteros.get(0));
							tab.put(s,new Types(tipo,p));
						}
					}
				}else{
					error.add("ERROR: "+s+" ya existe");
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
					error.add("ERROR: "+id+" ya existe");
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
					error.add("ERROR: "+id+" ya existe");
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
				error.add("ERROR: "+nodo.id+" ya existe");
			}
		}else if (n instanceof Block){
			Block nodo = (Block)n;
			for(Node e : nodo.dec){
				FieldDec fieldDec = (FieldDec)e;
				this.add(fieldDec);
			}
			
		}
	}
}