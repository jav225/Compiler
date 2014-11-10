package compiler.ast;
import compiler.lib.Printer;
public class SMethodCall extends Node{
	public Node meth;
	public SMethodCall(Node meth){
		this.meth = meth;
	}
	
	public void print(String padding,Boolean b,Printer out){
		meth.print(padding,b,out);
	}
} 