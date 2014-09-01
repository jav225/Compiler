parser grammar DecafParser;

options {
    tokenVocab=DecafScanner;
}

@parser::header{
  package compiler.parser;
  import compiler.lib.Printer;
}




/*-----------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/


start: (program | callout_decl | field_decl | method_decl | block | type | statement);

program: (callout_decl)* (field_decl)* (method_decl)*;

callout_decl: CALLOUT (id) PUNTOYCOMA;

field_decl: (type) ((id) | ((id) (BRAKET (int_literal) BRAKET2)) + COMA SEMICOLON);

method_decl: ((type) | VOID) (id) PARENTESIS (( (type)(id) )+ COMA) PARENTESIS2 (block);

block: BRACE (field_decl)* (statement)* BRACE2;

type: INT | BOO;

statement: ((location)(assign_op)(expr) PUNTOYCOMA) 
	| (method_call) 
	| (IF  BRACE (expr) BRACE2  (block) (ELSE (block)) PUNTOYCOMA) 
	| (FOR PARENTESIS (id) EQ (expr) COMA (expr) PARENTESIS2 (block) PUNTOYCOMA) 
	| (WHILE PARENTESIS (expr) PARENTESIS (block) PUNTOYCOMA) 
	| (RETURN BRAKET (expr) BRAKET2 PUNTOYCOMA) 
	| (CONTINUE PUNTOYCOMA);		

assign_op: EQ | PLEQ | MIEQ;

method_call: (method_name) PARENTESIS ((expr)+ COMA) PARENTESIS2 
	| (method_name) PARENTESIS ((callout_arg)+ COMA) PARENTESIS2;

method_name: (id);

location: (id) | (id) BRAKET (expr) BRAKET2;

expr: (location) 
	| (method_call) 
	| (literal) 
	| (expleft)(bin_op)(expr) 
	| SUB (expr) 
	| NO (expr) 
	| PARENTESIS (expr) PARENTESIS;

expleft: 
	(location) 
	| (method_call) 
	| (literal) 
	| SUB (expr) 
	| NO (expr) 
	| PARENTESIS (expr) PARENTESIS;

callout_arg: (expr) | (string_literal);

bin_op: (arith_op) | (rel_op) | (eq_op) | (cond_op);

arith_op: PLUS | SUB | MULT | DIV | PER;

rel_op: MEN | MAY | MEEQ | MAEQ;

eq_op: EQQ | NOEQ;

cond_op: ANDD | ORR;

literal: (int_literal) | (char_literal) | (bool_literal);

id: (alpha) (alpha_num)*;

alpha_num: (alpha) | (digit);

alpha: ALPHA;

digit: ENTEROS;

hex_digit: digit | AF; 

int_literal: (decimal_literal) | (hex_literal);

decimal_literal: (digit) (digit)*;

hex_literal: HEX;

bool_literal: BOOLEANS;

char_literal: CHAR;

string_literal: STRING; 





