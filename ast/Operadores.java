package compiler.ast;
import compiler.lib.Printer;
public class Operadores extends Node{
	public String s;
	public Operadores(String s){
		this.s = s;
	}
	
	public void print(String padding,Boolean b,Printer out){
		out.print(padding+s,b);
	}
} 