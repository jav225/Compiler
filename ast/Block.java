package compiler.ast;
import compiler.lib.Printer;
import java.util.LinkedList;
public class Block extends Node{
	public LinkedList<Node> dec, state;
	public Block(LinkedList<Node> dec,LinkedList<Node> state ){
		this.dec = dec;
		this.state = state;
	}
	
	public void print(String padding,Boolean b,Printer out){
		out.print(padding+ "Block",b);
		for(Node n : dec) 
			n.print("\t"+padding,b,out);
		for(Node n : state) 
			n.print("\t"+padding,b,out);
	}
} 
 
