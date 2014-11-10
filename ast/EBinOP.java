package compiler.ast;
import compiler.lib.Printer;
import java.util.LinkedList;
public class EBinOP extends Node{
	public Node binop, exp, expl;
	public EBinOP(Node binop, Node exp, Node expl ){
		this.binop = binop;
		this.exp = exp;
		this.expl = expl;
	}
	
	public void print(String padding,Boolean b,Printer out){
		binop.print(padding,b,out);
		expl.print("\t"+padding,b,out);
		exp.print("\t"+padding,b,out);
	}
} 
 
