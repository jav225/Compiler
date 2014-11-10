parser grammar DecafParser;

options {
    tokenVocab=DecafScanner;
}

@parser::header{
  package compiler.parser;
  import java.util.*;
}

@parser::members{
	public LinkedList<String> list = new LinkedList<String>();

  	public LinkedList<String> getlist(){
  		return list;
  	}
}


/*-----------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/


start		:	program 
				{list.add("start");}
				;


program		:	(callout_decl* field_decl* method_decl*)
				{list.add("program");}
				# prog //cheque
				;

type		:	( INT | BOO ) 	
				{list.add("type");} 	
				# tipo	//cheque	
				;

callout_decl:	CALLOUT ID SEMICOLON
				{list.add("callout_decl");}		
				# calloutDec //cheque
				;

field_decl	:	(type | VOID) (ID |IDB int_literal BRAKET2) (COMA (ID | IDB int_literal BRAKET2)*)? SEMICOLON
				{list.add("field_decl");} 
				# fieldDec //cheque
				;


method_decl	: 	((type | VOID) ID PARENTESIS (type ID  (COMA type ID)*)? PARENTESIS2 block)
				{list.add("method_decl");}		
				# methodDec //cheque
				;

block		: 	BRACE (field_decl)* (statement)* BRACE2 
				{list.add("block");}		
				#bloque //cheque
				;

statement	: 	(location assign_op expr SEMICOLON) 						#asigna //cheque
				| (method_call SEMICOLON)									#metodo //cheque
				| (IF  PARENTESIS expr PARENTESIS2 block (ELSE (block))?) 	#sif //cheque
				| (FOR PARENTESIS ID EQ expr COMA expr PARENTESIS2 block) 	#sfor //cheque
				| (WHILE PARENTESIS expr PARENTESIS2 block)  				#swhile //cheque
				| (RETURN expr? SEMICOLON) 									#sreturn //cheque
				| (CONTINUE SEMICOLON) 										#scontinue //cheque
				;
				finally {list.add("statement");}

assign_op	: 	(EQ | PLEQ | MIEQ)
				{list.add("assign_op");}
				# assingOP //cheque
				;

method_call	: 	ID PARENTESIS ((expr | STRING) (COMA (expr | STRING))*)? PARENTESIS2 
				{list.add("method_call");}
				# methodCall //cheque
				;

location	: 	((ID) | ((ID) BRAKET (expr) BRAKET2))
				{list.add("location");} 
				# locacion //cheque
				;

expr		:	location 						# expLoc //cheque
				| method_call  					# expMeth //cheque
				| literal 						# expLit //cheque
				| (expleft bin_op expr) 		# expOP //cheque
				| (SUB expr)					# expSub //cheque
				| (NO expr) 					# expNo //cheque
				| (PARENTESIS expr PARENTESIS2)	# expParent //cheque
				;
				finally {list.add("expr");}

expleft		: 	location 						# explLoc //cheque
				| method_call					# explMeth //cheque
				| literal 						# explLit  //cheque
				| (SUB expr) 					# explSub //cheque
				| (NO expr) 					# explNo //cheque
				| (PARENTESIS expr PARENTESIS2) # explParent //cheque
				;
				finally {list.add("expleft");}

callout_arg	: 	(expr | STRING)
				{list.add("callout_arg");} 	
				# callArg //cheque
				;

bin_op		:	(arith_op | rel_op | eq_op | cond_op)
				{list.add("bin_op");} 
				# binOP //cheque
				;

arith_op	: 	(PER | DIV | MULT | SUB | PLUS)
				{list.add("arith_op");}		
				# arithOP //cheque
				;

rel_op		: 	(MEN | MAY | MEEQ | MAEQ)
				{list.add("rel_op");}		
				# relOP //cheque
				;

eq_op		:	(EQQ | NOEQ)
				{list.add("eq_op");}	
				# eqOP //cheque
				;

cond_op		: 	(ANDD | ORR)
				{list.add("cond_op");}	
				# condOP //cheque
				;

literal 	:	(int_literal | CHAR | BOOLEANS)
				{list.add("literal");} 	
				# lit //cheque
				;

int_literal	:	(decimal_literal | HEX)
				{list.add("int_literal");}		
				# intLit //cheque
				;

decimal_literal:(ENTEROS (ENTEROS)*)
				{list.add("decimal_literal");}	
				# decLit //cheque
				;