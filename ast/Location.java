package compiler.ast;
import compiler.lib.Printer;
public class Location extends Node{
	public String id;
	public Node exp;
	public Location(String s){
		this.id = s;
		this.exp = null;
	}
	public Location(String s, Node exp){
		this.id = s;
		this.exp = exp;
	}
	
	public void print(String padding,Boolean b,Printer out){
		if(exp==null){
			out.print(padding + id,b);
		}else{
			out.print(padding + id,b);
			exp.print("\t" + padding,b,out);
		}
	}
} 
 
