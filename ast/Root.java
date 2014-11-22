package compiler.ast;
import compiler.lib.Printer;
import java.util.List;
import java.util.LinkedList;

public class Root extends Node{
	public LinkedList<Node> list;
	public Root(){
		this.list = new LinkedList<Node>();
	}
	
	public void add(Node node){
		this.list.add(node);
	}
	
	public void print(String padding,Boolean b,Printer out){
		out.print("ROOT",b);
		for(Node n : list) 
			n.print(padding,b,out);
	}
	
	public void print(Boolean b,Printer out){
		print("\t",b,out);
	}
} 
 
 
