package compiler.ast;
import compiler.lib.Printer;
public class Sif extends Node{
	public Node exp,block1,block2;
	public Sif(Node exp, Node block1){
		this.exp = exp;
		this.block1 = block1;
		this.block2 = null;
	}
	public Sif(Node exp, Node block1, Node block2){
		this.exp = exp;
		this.block1 = block1;
		this.block2 = block2;
	}
	public void print(String padding,Boolean b,Printer out){
		if(block2 == null){
			out.print(padding+"IF",b);
			exp.print("\t"+padding,b,out);
			block1.print("\t"+padding,b,out);
		}else{
			out.print(padding+"IF",b);
			exp.print("\t"+padding,b,out);
			block1.print("\t"+padding,b,out);
			out.print(padding+"ELSE",b);
			block2.print("\t"+padding,b,out);
		}
	}
} 