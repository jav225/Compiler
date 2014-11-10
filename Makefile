make:lib\Printer.class lib\ErrorHandler.class scanner\Scanner.java scanner\Scanner.class scanner\DecafScanner.class parser\CC4Parser.java parser\CC4Parser.class ast\Ast.class semantic\Semantic.class irt\Irt.class codegen\Codegen.class Compiler.class  
	
Compiler.class: Compiler.java
	javac Compiler.java

ast\Ast.class: ast\Ast.java
	javac ast\Ast.java

codegen\Codegen.class: codegen\Codegen.java
	javac codegen\Codegen.java

irt\Irt.class: irt\Irt.java
	javac irt\Irt.java

lib\ErrorHandler.class: lib\ErrorHandler.java
	javac lib\ErrorHandler.java

lib\Printer.class: lib\Printer.java
	javac lib\Printer.java

semantic\Semantic.class: semantic\Semantic.java
	javac semantic\Semantic.java

parser\CC4Parser.class: parser\CC4Parser.java
	javac parser\CC4Parser.java

parser\CC4Parser.java: parser\DecafParser.g
	java org.antlr.v4.Tool -lib scanner -visitor parser\DecafParser.g	

scanner\Scanner.class: scanner\Scanner.java
	javac scanner\Scanner.java

scanner\DecafScanner.class: scanner\DecafScanner.java
	javac scanner\DecafScanner.java

scanner\Scanner.java: scanner\DecafScanner.g
	java org.antlr.v4.Tool scanner\DecafScanner.g	

clean:
	del *.class 
	del scanner\*.class
	del parser\*.class
	del ast\*.class
	del codegen\*.class
	del lib\*.class
	del semantic\*.class

