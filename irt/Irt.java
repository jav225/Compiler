/*Irt.java*/
package compiler.irt;
import java.io.*;
import compiler.lib.Printer;
import compiler.semantic.Semantic;
public class Irt{
	Semantic s;
	Printer out;
	public Irt(Semantic s)throws Exception{
		this.s = s;
		this.out = s.getPrinter();
		boolean d = s.isDebugON("irt");
		out.print("stage: semantic \n",d);
	}
	public Printer getPrinter(){
		return s.getPrinter();
	}
	public boolean isDebugON(String se){
		return s.isDebugON(se);
	}
}