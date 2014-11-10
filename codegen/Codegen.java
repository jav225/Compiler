/*Codegen.java*/
package compiler.codegen;

import java.io.*;
import compiler.irt.Irt;
import compiler.lib.Printer;
public class Codegen{
	Irt i ;
	Printer out;
	public Codegen(Irt i)throws Exception{
		this.i = i;
		this.out = i.getPrinter();
		boolean d=i.isDebugON("codegen");
		out.print("stage: generating code",d);
	}
}