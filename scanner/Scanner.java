/*Scanner.java*/

package compiler.scanner;
import org.antlr.v4.runtime.*;
import java.io.*;
import compiler.lib.Printer;

import compiler.scanner.DecafScanner;


public class Scanner{
	private DecafScanner scann;
	private Printer out;
	private String filename,debug;
	public Scanner(Printer out,String filename,String debug)throws Exception{
		this.out = out;
		this.filename = filename;
		this.debug = debug;
		boolean d = this.isDebugON("scann");
		
		out.print("stage: Scanner \n",d);
		try{
		    scann = new DecafScanner(new ANTLRFileStream(filename));
		    Token t;
		    while ((t = scann.nextToken()).getType() != Token.EOF){
		    	out.print(DecafScanner.ruleNames[t.getType()-1]+"\n",d);
		    }
		}catch(ArrayIndexOutOfBoundsException aiobe){
		    System.err.println("Must provide a valid path to the filename with the tokens");
		    System.exit(1);
		}catch(Exception e){
		    System.err.println("Must provide a valid path to the filename with the tokens");
		    System.exit(1);
		}
	}
	public DecafScanner getScanner(){
		return this.scann;
	}
	public Printer getPrinter(){
		return this.out;
	}
	public boolean isDebugON(String s){
		String[] d = this.debug.split(":");
		boolean r = false;
		for (int i = 0;i<d.length;i++)
			r=d[i].equals(s);
		return r;
	}
}