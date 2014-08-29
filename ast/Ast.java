/*Ast.java*/
package compiler.ast;
import java.io.*;
import compiler.lib.Printer;
import compiler.parser.CC4Parser;
public class Ast{
	CC4Parser c;
	public Ast(Printer out)throws Exception{
		this.c = new CC4Parser(out);
		//Printer out = new Printer(name,"flag");
		out.print("stage: CC4Parser \n");
		//out.close();
	}
	/*public String stage(){
		return c.stage() +"stage: CC4Parser \n";
	}*/
}