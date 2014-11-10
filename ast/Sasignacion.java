package compiler.ast;
import compiler.lib.Printer;
public class Sasignacion extends Node{
	public Node loc, sig, exp;
	public Sasignacion(Node loc, Node sig, Node exp){
		this.loc = loc;
		this.sig = sig;
		this.exp = exp;
	}
	
	public void print(String padding,Boolean b,Printer out){
		sig.print(padding,b,out);
		loc.print("\t"+padding,b,out);
		exp.print("\t"+padding,b,out);
	}
} 