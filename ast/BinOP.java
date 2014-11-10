package compiler.ast;
import compiler.lib.Printer;
public class BinOP extends Node{
	public Node arith, rel, eq, cond;
	public BinOP(Node arith, Node rel, Node eq, Node cond){
		this.arith = arith;
		this.rel = rel;
		this.eq	= eq;
		this.cond = cond;
	}
	
	public void print(String padding,Boolean b,Printer out){

		if (arith!=null){
			arith.print(padding,b,out);
		}else if (rel!= null){
			rel.print(padding,b,out);
		}else if (eq!= null){
			eq.print(padding,b,out);
		}else{
			cond.print(padding,b,out);
		}
	}
} 