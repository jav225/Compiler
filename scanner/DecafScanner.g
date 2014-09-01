lexer grammar DecafScanner;

@lexer::header{
	package compiler.scanner;
}



WS 	: 	(' ') -> skip;
NL : ('\n');
TAB : ('\t') -> skip;

STRING: '"'~('"')*'"';

//OPERATIONS 
PLUS : '+';
MULT : '*';
DIV:   '/';
SUB:   '-';
AND:   '&';
OR:	   '|';
EQ:    '=';
PER:   '%';
MAY:   '>';
MEN:   '<';
MAEQ:  '>=';
MEEQ:  '<=';
EQQ:   '==';
NOEQ:  '!=';
ANDD:  '&&';
ORR:   '||';
EXP:   '^';
PLEQ:   '+=';
MIEQ: 	'-=';
NO: 	'!';

//PALABRAS RESERVADAS
INT: 'int';
BOO: 'boolean';
FLOAT: 'float';
IF: 'if';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';
BREAK: 'break';
VOID: 'void';
CALLOUT: 'callout';
CONTINUE: 'continue';
ELSE: 'else';

//COMENTARIOS
COMMENT: '//'.+'/n' ->skip;

AF: [a-fA-F];
COMA: ',';
COLON: ':';
SEMICOLON: ';';
BRACE: '{';
BRACE2: '}';
BRAKET: '[';
BRAKET2: ']';
PUNTOYCOMA: ';';
PARENTESIS: '(';
PARENTESIS2: ')';
ENTEROS: ('0'..'9')+;
ALPHA: ([a-zA-Z]);
FLOTANTES: ('0'..'9')+'.'('0'..'9')+;
HEX: '0x'([0-9a-fA-F]+);
CHAR:  '\''.'\'';
BOOLEANS: ('true'|'false');
VARIABLES: [a-zA-Z]([a-zA-Z] | [0-9])*;

