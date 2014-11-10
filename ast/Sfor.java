package compiler.ast;
import compiler.lib.Printer;
public class Sfor extends Node{
	public String id;
	public Node exp1,exp2,block;

	public Sfor(String id, Node exp1, Node exp2, Node block){
		this.id = id;
		this.exp1 = exp1;
		this.exp1 = exp2;
		this.block = block;
	}
	
	public void print(String padding,Boolean b,Printer out){
		out.print(padding+"FOR",b);
		out.print(padding+"=",b);
		out.print("\t \t"+id,b);
		
		exp1.print("\t \t"+ padding,b,out);
		exp2.print("\t"+ padding,b,out);
		block.print("\t"+ padding,b,out);

	}
} 