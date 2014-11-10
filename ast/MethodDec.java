package compiler.ast;
import compiler.lib.Printer;
import java.util.LinkedList;
public class MethodDec extends Node{
	public LinkedList<Node> type;
	public LinkedList<String> id;
	public boolean boo;
	public Node b;
	public MethodDec(LinkedList<Node> type, LinkedList<String> id, Node b, boolean boo){
		this.type = type;
		this.id = id;
		this.b = b;
		this.boo = boo;
	}
	
	public void print(String padding,Boolean t,Printer out){
		if(boo){
			type.get(0).print(padding,t,out);
			out.print("\t"+padding+id.get(0),t);
			
			for(int i = 1;i<type.size();i++){
				type.get(i).print("\t \t"+padding,t,out);
				out.print("\t"+padding+id.get(i),t);
			}
			
			b.print("\t"+padding,t,out);
		}else{
			out.print(padding+"VOID",t);
			out.print("\t"+padding+id.get(0),t);
			
			for(int i = 1;i<type.size();i++){
				type.get(i-1).print("\t \t"+padding,t,out);
				out.print("\t"+padding+id.get(i),t);
			}

			b.print("\t \t"+padding,t,out);
		}
	}
} 
 
