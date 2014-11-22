package compiler.semantic;

import java.util.LinkedList;

public class Types{
	public String type;
	public int dimArray;
	public LinkedList<Args> args;
	public Types(String type){
		this.type = type;
		dimArray = 0;
	}
	public Types(String type,int dimArray){
		this.type = type;
		this.dimArray = dimArray;
	}
	public Types(String type,LinkedList<Args> args){
		this.type = type;
		this.args = args;
		dimArray = 0;
	}
	public String toString(){
		if(dimArray!=0){
			return  type+ "[" +Integer.toString(dimArray)+ "]";
		}else if(args!=null){
			String s = type;
			for(Args a : args){
				s += "," + a.toString();
			}
			return s;
		}else{
			return type;
		}
	}
}