/*Semantic.java*/
package compiler.semantic;
import java.io.*;
import compiler.lib.Printer;
import compiler.ast.Ast;
public class Semantic{
	Ast a;
	public Semantic(Printer out)throws Exception{
		this.a = new Ast(out);
		//Printer out = new Printer(name,"flag");
		out.print("stage: Ast \n");
		//out.close();
	}
	/*public String stage(){
		return a.stage() +"stage: Ast \n";
	}*/
}