/*Ast.java*/
package compiler.ast;
import java.io.*;
import compiler.lib.Printer;
import compiler.parser.CC4Parser;
public class Ast{
	CC4Parser c;
	Printer out;
	public Ast(CC4Parser c)throws Exception{
		this.c = c;
		this.out = c.getPrinter();
		boolean d= c.isDebugON("ast");
		
		AstVisitor visitor = new AstVisitor();
  		Root root = (Root)visitor.visit(c.getTree());
  		
		out.print("stage: ast \n",d);
		root.print(d,out);
		
	}
	public Printer getPrinter(){
		return c.getPrinter();
	}
	public boolean isDebugON(String s){
		return c.isDebugON(s);
	}
}