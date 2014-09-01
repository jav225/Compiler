/*Scanner.java*/

package compiler.scanner;
import org.antlr.v4.runtime.*;
import java.io.*;
import compiler.lib.Printer;

import compiler.scanner.DecafScanner;

public class Scanner{
	public Scanner(Printer out,String filename)throws Exception{
		out.print("stage: Scanning \n");
		try{
		    DecafScanner lexer = new DecafScanner(new ANTLRFileStream(filename));
		    while (lexer.nextToken().getType() != Token.EOF);
		}catch(ArrayIndexOutOfBoundsException aiobe){
		    System.err.println("Must provide a valid path to the filename with the tokens");
		    System.exit(1);
		}catch(Exception e){
		    System.err.println("Must provide a valid path to the filename with the tokens");
		    System.exit(1);
		}
		out.close();
	}
}