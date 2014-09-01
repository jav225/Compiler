make: scanner/Scanner.java scanner/Scanner.class parser/CC4Parser.java parser/CC4Parser.class Compiler.class
	
Compiler.class: Compiler.java
	javac Compiler.java

parser/CC4Parser.class: parser/CC4Parser.java
	javac parser/CC4Parser.java

parser/CC4Parser.java: parser/DecafParser.g
	java org.antlr.v4.Tool -lib scanner parser/DecafParser.g	

scanner/Scanner.class: scanner/DecafScanner.java
	javac scanner/DecafScanner.java

scanner/Scanner.java: scanner/DecafScanner.g
	java org.antlr.v4.Tool scanner/DecafScanner.g	

clean:
	rm *.class 
	rm scanner/*.class
	rm scanner/*.tokens
	rm parser/*.class
	rm parser/*.tokens

