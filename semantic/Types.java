package compiler.semantic;

import java.util.LinkedList;

public class Types{
	public String type, asignacion;
	public int dimArray;
	public LinkedList<Args> args;
	public Types(String type){
		this.type = type;
	}
	public Types(String type,int dimArray){
		this.type = type;
		this.dimArray = dimArray;
	}
	public Types(String type,LinkedList<Args> args){
		this.type = type;
		this.args = args;
	}
	public boolean add(){
		return true;
	}
}