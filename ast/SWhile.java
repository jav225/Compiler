package compiler.ast;
import compiler.lib.Printer;
public class SWhile extends Node{
	public Node exp, block;
	public SWhile(Node exp, Node block){
		this.exp = exp;
		this.block = block;
	}
	
	public void print(String padding,Boolean b,Printer out){
		out.print(padding+"WHILE",b);
		exp.print("\t"+padding,b,out);
		block.print("\t"+padding,b,out);
	}
} 