package compiler.ast;
import compiler.lib.Printer;
public class Sreturn extends Node{
	public Node exp;
	public Sreturn(Node exp){
		this.exp = exp;
	}

	
	public void print(String padding,Boolean b,Printer out){
		out.print(padding+"RETURN",b);
		if(exp!=null)
			exp.print("\t"+padding,b,out);
	}
} 