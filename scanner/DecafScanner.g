lexer grammar DecafScanner;

@lexer::header{
	package compiler.scanner;
}


 
WS 			:	(' ') -> skip;
NL 			:	('\n') -> skip;
TAB 		:	('\t') -> skip;
RET 		:	('\r') -> skip;
DOT 		:	'.' -> skip;	


WSS 		:	('\' \'');
NLS 		:	('\'\\n\'');
TABS 		:	('\'\\t\'');
RETS 		:	('\'\\r\'');
DIAGS		:	('\'\\\\\'');
COS 		:	('\'\\\"\'');

//STRING
STRING 		:	'"'(~('"'|'\'')|'\\''\''|'\\''\"')*'"';
ERRSTRING 		:	'"'(~('"')|'\\''\''|'\\''\"')*'\''?;

//ERRORES CHAR
ERRSQ		:	SCOM SCOM SCOM;
ERRINBS		:	SCOM '\\'~('t'|'n'|'r') SCOM;
ERRNL		:	SCOM '\n' SCOM;
ERRNSCOMF	:	SCOM '\\' SCOM;
ERRNBS 		:	SCOM ~('t'|'n'|'r') SCOM;
ERRMCHAR	:	SCOM .*? SCOM;
ERRTC		:	SCOM '\t' SCOM;
ERRHEXND	:	'0x';

//ERRORES PALABRAS RESERVADAS
ERRIF		:	('If'|'iF');

//OPERATIONS 
PLUS 		:	'+';
MULT 		:	'*';
DIV			:	'/';
SUB			:	'-';
AND 		:	'&';
OR 			:	'|';
EQ 			:	'=';
PER			:	'%';
MAY			:	'>';
MEN			:	'<';
MAEQ		:	'>=';
MEEQ		:	'<=';
EQQ			:	'==';
NOEQ		:	'!=';
ANDD		:	'&&';
ORR			:	'||';
EXP			:	'^';
PLEQ		:	'+=';
MIEQ		:	'-=';
NO 			:	'!';

//PALABRAS RESERVADAS
INT 		:	'int';
BOO 		:	'boolean';
FLOAT 		:	'float';
IF 			:	'if';
FOR 		:	'for';
WHILE 		:	'while';
RETURN 		:	'return';
BREAK 		:	'break';
VOID 		:	'void';
CALLOUT 	:	'callout';
CONTINUE 	:	'continue';
ELSE 		:	'else';

//COMENTARIOS
COMMENT		:	(('//'~('\n')*'\n') | (('/*') ~('\n')* ('*/'))) ->skip;

//AF: [a-fA-F];
COMA 		:	',';
COLON 		:	':';
SEMICOLON 	:	';';
BRACE 		:	'{';
BRACE2		:	'}';
BRAKET 		:	'[';
BRAKET2		:	']';
PARENTESIS 	:	'(';
PARENTESIS2	:	')';
ENTEROS		:	'-'?('0'..'9')+;
FLOTANTES	:	('0'..'9')+'.'('0'..'9')+;
HEX			:	'0x'([0-9a-fA-F]+);
CHAR		:	'\''.?'\'';
BOOLEANS	:	('true'|'false');
ID			:	[a-zA-Z|'_']([a-zA-Z] | [0-9]|'_')*;
IDB			: 	ID BRAKET;

fragment SCOM: '\'';