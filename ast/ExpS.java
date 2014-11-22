package compiler.ast;
import compiler.lib.Printer;
import java.util.LinkedList;
public class ExpS extends Node{
	public Node exp;
	public String s;
	public ExpS(Node exp, String s){
		this.s = s;
		this.exp = exp;
	}
	
	public void print(String padding,Boolean b,Printer out){
		switch (s) {
			case "-":
				out.print(padding+"-",b);
				exp.print(padding,b,out);
			break;
			case "!":
				out.print(padding+"!",b);
				exp.print(padding,b,out);
			break;
			case "(":
				out.print(padding+"(",b);
				exp.print(padding,b,out);
				out.print(padding+")",b);
			break;
		}
	}
} 
 
