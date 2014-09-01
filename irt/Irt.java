/*Irt.java*/
package compiler.irt;
import java.io.*;
import compiler.lib.Printer;
import compiler.semantic.Semantic;
public class Irt{
	Semantic s;
	public Irt(Printer out,String filename)throws Exception{
		this.s = new Semantic(out,filename);
		out.print("stage: semantic \n");
	}
}