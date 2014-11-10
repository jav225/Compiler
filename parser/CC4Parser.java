/*CC4Parser.java*/
package compiler.parser;
import java.io.*;
import java.util.*;
import compiler.lib.Printer;
import compiler.scanner.Scanner;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import compiler.scanner.DecafScanner;
import compiler.parser.DecafParser;
public class CC4Parser{
	Scanner s;
	Printer out;
	private ParseTree tree;
	public CC4Parser(Scanner s)throws Exception{
		this.s = s;
		this.out= s.getPrinter();
		boolean d= s.isDebugON("parser");

		out.print("\nstage: parsing \n",d);

		try {	    
	    	s.getScanner().reset();
	    	DecafParser parser = new DecafParser(new CommonTokenStream(s.getScanner()));
	    	this.tree = parser.start();

		    LinkedList<String> reglas = parser.list;

		    for(int i = 0; i<reglas.size(); i++){
		    	out.print("visited: " + reglas.get(i)+ "\n",d);
		    }
	   

	    } catch (ArrayIndexOutOfBoundsException aiobe) {
	      System.err.println("usage: java Main <file>\nwhere file is the path to the filename with the tokens");
	      System.exit(1);
	    } catch (Exception e) {
	      System.err.println("usage: java Main <file>\nwhere file is the path to the filename with the tokens");
	      System.exit(1);
	    }
	}
	public ParseTree getTree(){
		return this.tree;
	}
	public DecafScanner getScanner(){
		return s.getScanner();	
	}
	public Printer getPrinter(){
		return s.getPrinter();
	}
	public boolean isDebugON(String se){
		return s.isDebugON(se);
	}
}