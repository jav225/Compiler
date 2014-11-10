package compiler.ast;
import compiler.lib.Printer;
public class AssingOP extends Node{
	public String op;
	public AssingOP(String s){
		this.op = s;
	}
	
	public void print(String padding,Boolean b,Printer out){
		out.print(padding + this.op,b);
	}
} 
 
