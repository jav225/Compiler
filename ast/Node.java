package compiler.ast;
import compiler.lib.Printer;
public abstract class Node{
	public abstract void print(String padding,Boolean b, Printer out);
} 