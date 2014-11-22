/*Semantic.java*/
package compiler.semantic;
import java.io.*;
import compiler.lib.Printer;
import compiler.ast.Ast;
public class Semantic{
	Ast a;
	Printer out;
	boolean d;
	public Semantic(Ast a)throws Exception{
		this.a = a;
		this.out = a.getPrinter();
		d = a.isDebugON("semantic");
		out.print("stage: Semantic \n",d);

		//creando las tablas
		Tabla tab = new Tabla("Root",null);
		tab.add(a.getRoot());
		tab.ifMain(tab);
		getErrores(tab);
		tab.toString(out,d);
	}
	public Printer getPrinter(){
		return a.getPrinter();
	}
	public boolean isDebugON(String s){
		return a.isDebugON(s);
	}
	public void getErrores(Tabla tabla){
		for(String s : tabla.error){
			out.print(s,d);
		}
		for(Tabla t : tabla.hijos){
			getErrores(t);
		}
	}
}