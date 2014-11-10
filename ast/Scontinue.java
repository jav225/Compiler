package compiler.ast;
import compiler.lib.Printer;
public class Scontinue extends Node{
	public Scontinue(){

	}
	
	public void print(String padding,Boolean b,Printer out){
		out.print(padding+"CONTINUE",b);
	}
} 
 
