/*Irt.java*/
package compiler.irt;
import java.io.*;
import compiler.lib.Printer;
import compiler.semantic.Semantic;
public class Irt{
	Semantic s;
	public Irt(Printer out)throws Exception{
		this.s = new Semantic(out);
		//Printer out = new Printer(name,"flag");
		out.print("stage: semantic \n");
		//out.close();
	}
	/*public String stage(){
		return s.stage() +"stage: semantic \n";
	}*/
}