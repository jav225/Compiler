package compiler.ast;
import compiler.lib.Printer;
public class Exprecion extends Node{
	public Node exp;
	public Exprecion(Node exp){
		this.exp=exp;
	}
	
	public void print(String padding,Boolean b,Printer out){
		exp.print(padding,b,out);
	}
} 
 
