package compiler.ast;
import compiler.lib.Printer;
public class Callout extends Node{
	
	public String id;
	public Callout(String s){		
		this.id = s;
	}
	
	public void print(String padding,Boolean b,Printer out){
		out.print(padding + id,b);
		
	}
} 
 
