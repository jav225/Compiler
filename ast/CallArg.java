package compiler.ast;
import compiler.lib.Printer;
public class CallArg extends Node{
	public Node exp;
	public String s;
	public CallArg(String s, Node exp){
		this.exp = exp;
		this.s = s;
	}
	
	public void print(String padding,Boolean b,Printer out){
		if (exp == null){
			out.print(padding+s,b);
		}else{
			exp.print(padding,b,out);
		}
	}
} 