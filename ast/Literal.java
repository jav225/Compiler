package compiler.ast;
import compiler.lib.Printer;
public class Literal extends Node{
	public Node lit;
	public String s;
	public Literal(String s, Node lit){
		this.s = s;
		this.lit = lit;
	}
	
	public void print(String padding,Boolean b,Printer out){
		if(lit != null){
			lit.print(padding,b,out);
		}else{
			out.print(padding+s,b);
		}
	}
} 