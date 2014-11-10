/*Semantic.java*/
package compiler.semantic;
import java.io.*;
import compiler.lib.Printer;
import compiler.ast.Ast;
public class Semantic{
	Ast a;
	Printer out;
	public Semantic(Ast a)throws Exception{
		this.a = a;
		this.out = a.getPrinter();
		boolean d = a.isDebugON("semantic");
		out.print("stage: Ast \n",d);
	}
	public Printer getPrinter(){
		return a.getPrinter();
	}
	public boolean isDebugON(String s){
		return a.isDebugON(s);
	}
}