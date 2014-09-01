/*Semantic.java*/
package compiler.semantic;
import java.io.*;
import compiler.lib.Printer;
import compiler.ast.Ast;
public class Semantic{
	Ast a;
	public Semantic(Printer out,String filename)throws Exception{
		this.a = new Ast(out,filename);
		out.print("stage: Ast \n");
	}
}