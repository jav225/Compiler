/*CC4Parser.java*/
package compiler.parser;
import java.io.*;
import compiler.lib.Printer;
import compiler.scanner.Scanner;
import org.antlr.v4.runtime.*;
import compiler.scanner.DecafScanner;
import compiler.parser.DecafParser;
public class CC4Parser{
	Scanner s;
	public CC4Parser(Printer out,String filename)throws Exception{
		this.s = new Scanner(out,filename);
		out.print("stage: parsing \n");
		try {	    
	     (new DecafParser(new CommonTokenStream(new DecafScanner(new ANTLRFileStream(filename))))).start();
	    } catch (ArrayIndexOutOfBoundsException aiobe) {
	      System.err.println("usage: java Main <file>\nwhere file is the path to the filename with the tokens");
	      System.exit(1);
	    } catch (Exception e) {
	      System.err.println("usage: java Main <file>\nwhere file is the path to the filename with the tokens");
	      System.exit(1);
	    } 
	}
}