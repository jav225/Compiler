package compiler.ast;
import compiler.lib.Printer;
import java.util.LinkedList;
public class MethodCall extends Node{
	public String id;
	public LinkedList<String> s;
	public LinkedList<Node> exp;
	public MethodCall(String id,LinkedList<String> s,LinkedList<Node> exp ){
		this.id = id;
		this.s = s;
		this.exp = exp;
	}
	
	public void print(String padding,Boolean b,Printer out){
		out.print(padding+id,b);
		for(String n : s){
			out.print(padding + "\t" +n,b);
		}
		for(Node n : exp) 
			n.print("\t"+padding,b,out);
	}
} 
 
