package compiler.semantic;

public class Args{
	public String type,name;
	public Args(String type,String name){
		this.type = type;
		this.name = name;
	}
	public String toString(){
		return type + "\t" + name;
	}
}