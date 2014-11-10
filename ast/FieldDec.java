package compiler.ast;
import compiler.lib.Printer;
import java.util.LinkedList;
public class FieldDec extends Node{
	public LinkedList<Node> lit;
	public LinkedList<String> id, idb;
	public Node type;
	public String v;
	public FieldDec(Node type, LinkedList<String> id, LinkedList<String> idb, LinkedList<Node> lit){
		this.type=type;
		this.id = id;
		this.idb = idb;
		this.lit = lit;
		v=null;
	}
	public FieldDec(String v, LinkedList<String> id, LinkedList<String> idb, LinkedList<Node> lit){
		this.v=v;
		this.id = id;
		this.idb = idb;
		this.lit = lit;
		type= null;
	}
	
	public void print(String padding,Boolean b,Printer out){
		if(type!=null){
			type.print(padding,b,out);
			for(String n : id) {
				out.print("\t"+padding+n,b);
			}
				
			for(int i = 0; i < idb.size();i++){
				out.print("\t"+padding+idb.get(i),b);
				out.print("]",b);
			}

		}else{
			out.print(padding+"VOID",b);
			for(String n : id) {
				out.print("\t"+padding+n,b);
			}
			for(int i = 0; i < idb.size();i++){
				out.print("\t"+padding+idb.get(i),b);
				out.print("]",b);
			}
		}	
	}
} 
 
