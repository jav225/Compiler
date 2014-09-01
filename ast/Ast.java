/*Ast.java*/
package compiler.ast;
import java.io.*;
import compiler.lib.Printer;
import compiler.parser.CC4Parser;
public class Ast{
	CC4Parser c;
	public Ast(Printer out,String filename)throws Exception{
		this.c = new CC4Parser(out,filename);
		out.print("stage: CC4Parser \n");
	}
}