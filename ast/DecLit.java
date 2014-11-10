package compiler.ast;
import compiler.lib.Printer;
import java.util.LinkedList;
public class DecLit extends Node{
	public LinkedList<String> enteros;
	public DecLit(LinkedList<String> enteros ){
		this.enteros = enteros;
	}
	
	public void print(String padding,Boolean b,Printer out){
		for(String n : enteros){
			out.print(padding+n,b);
		} 
			
	}
} 
 
