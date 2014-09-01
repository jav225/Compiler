// Generated from parser/DecafParser.g by ANTLR 4.4

  package compiler.parser;
  import compiler.lib.Printer;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DecafParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=30, BRAKET2=44, CHAR=52, MAY=13, FOR=29, SUB=8, ORR=20, FLOAT=27, 
		AND=9, BREAK=32, PARENTESIS2=47, BRACE=41, IF=28, EXP=21, CONTINUE=35, 
		HEX=51, MIEQ=23, BOO=26, RETURN=31, PARENTESIS=46, PLUS=5, VOID=33, NL=2, 
		EQ=11, AF=37, BRAKET=43, CALLOUT=34, BRACE2=42, PER=12, NO=24, ELSE=36, 
		TAB=3, INT=25, SEMICOLON=40, MULT=6, COMA=38, ALPHA=49, ENTEROS=48, COLON=39, 
		PUNTOYCOMA=45, BOOLEANS=53, WS=1, FLOTANTES=50, NOEQ=18, MEN=14, PLEQ=22, 
		OR=10, VARIABLES=54, MAEQ=15, DIV=7, MEEQ=16, EQQ=17, ANDD=19, STRING=4;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "NL", "TAB", "STRING", "'+'", "'*'", "'/'", "'-'", 
		"'&'", "'|'", "'='", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
		"'&&'", "'||'", "'^'", "'+='", "'-='", "'!'", "'int'", "'boolean'", "'float'", 
		"'if'", "'for'", "'while'", "'return'", "'break'", "'void'", "'callout'", 
		"'continue'", "'else'", "AF", "','", "':'", "SEMICOLON", "'{'", "'}'", 
		"'['", "']'", "PUNTOYCOMA", "'('", "')'", "ENTEROS", "ALPHA", "FLOTANTES", 
		"HEX", "CHAR", "BOOLEANS", "VARIABLES"
	};
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_callout_decl = 2, RULE_field_decl = 3, 
		RULE_method_decl = 4, RULE_block = 5, RULE_type = 6, RULE_statement = 7, 
		RULE_assign_op = 8, RULE_method_call = 9, RULE_method_name = 10, RULE_location = 11, 
		RULE_expr = 12, RULE_expleft = 13, RULE_callout_arg = 14, RULE_bin_op = 15, 
		RULE_arith_op = 16, RULE_rel_op = 17, RULE_eq_op = 18, RULE_cond_op = 19, 
		RULE_literal = 20, RULE_id = 21, RULE_alpha_num = 22, RULE_alpha = 23, 
		RULE_digit = 24, RULE_hex_digit = 25, RULE_int_literal = 26, RULE_decimal_literal = 27, 
		RULE_hex_literal = 28, RULE_bool_literal = 29, RULE_char_literal = 30, 
		RULE_string_literal = 31;
	public static final String[] ruleNames = {
		"start", "program", "callout_decl", "field_decl", "method_decl", "block", 
		"type", "statement", "assign_op", "method_call", "method_name", "location", 
		"expr", "expleft", "callout_arg", "bin_op", "arith_op", "rel_op", "eq_op", 
		"cond_op", "literal", "id", "alpha_num", "alpha", "digit", "hex_digit", 
		"int_literal", "decimal_literal", "hex_literal", "bool_literal", "char_literal", 
		"string_literal"
	};

	@Override
	public String getGrammarFileName() { return "DecafParser.g"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Callout_declContext callout_decl() {
			return getRuleContext(Callout_declContext.class,0);
		}
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Method_declContext method_decl() {
			return getRuleContext(Method_declContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Field_declContext field_decl() {
			return getRuleContext(Field_declContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(64); program();
				}
				break;
			case 2:
				{
				setState(65); callout_decl();
				}
				break;
			case 3:
				{
				setState(66); field_decl();
				}
				break;
			case 4:
				{
				setState(67); method_decl();
				}
				break;
			case 5:
				{
				setState(68); block();
				}
				break;
			case 6:
				{
				setState(69); type();
				}
				break;
			case 7:
				{
				setState(70); statement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<Callout_declContext> callout_decl() {
			return getRuleContexts(Callout_declContext.class);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public Callout_declContext callout_decl(int i) {
			return getRuleContext(Callout_declContext.class,i);
		}
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALLOUT) {
				{
				{
				setState(73); callout_decl();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(79); field_decl();
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOO) | (1L << VOID))) != 0)) {
				{
				{
				setState(85); method_decl();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Callout_declContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PUNTOYCOMA() { return getToken(DecafParser.PUNTOYCOMA, 0); }
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public Callout_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCallout_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCallout_decl(this);
		}
	}

	public final Callout_declContext callout_decl() throws RecognitionException {
		Callout_declContext _localctx = new Callout_declContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_callout_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(CALLOUT);
			{
			setState(92); id();
			}
			setState(93); match(PUNTOYCOMA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Field_declContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public Int_literalContext int_literal(int i) {
			return getRuleContext(Int_literalContext.class,i);
		}
		public List<TerminalNode> BRAKET2() { return getTokens(DecafParser.BRAKET2); }
		public List<Int_literalContext> int_literal() {
			return getRuleContexts(Int_literalContext.class);
		}
		public TerminalNode COMA() { return getToken(DecafParser.COMA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> BRAKET() { return getTokens(DecafParser.BRAKET); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode BRAKET2(int i) {
			return getToken(DecafParser.BRAKET2, i);
		}
		public TerminalNode BRAKET(int i) {
			return getToken(DecafParser.BRAKET, i);
		}
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterField_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitField_decl(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(95); type();
			}
			setState(109);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				{
				setState(96); id();
				}
				}
				break;
			case 2:
				{
				setState(102); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					{
					setState(97); id();
					}
					{
					setState(98); match(BRAKET);
					{
					setState(99); int_literal();
					}
					setState(100); match(BRAKET2);
					}
					}
					}
					setState(104); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ALPHA );
				setState(106); match(COMA);
				setState(107); match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declContext extends ParserRuleContext {
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public TerminalNode COMA() { return getToken(DecafParser.COMA, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_decl(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			switch (_input.LA(1)) {
			case INT:
			case BOO:
				{
				{
				setState(111); type();
				}
				}
				break;
			case VOID:
				{
				setState(112); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(115); id();
			}
			setState(116); match(PARENTESIS);
			{
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				{
				setState(117); type();
				}
				{
				setState(118); id();
				}
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT || _la==BOO );
			setState(124); match(COMA);
			}
			setState(126); match(PARENTESIS2);
			{
			setState(127); block();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode BRACE2() { return getToken(DecafParser.BRACE2, 0); }
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public TerminalNode BRACE() { return getToken(DecafParser.BRACE, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(BRACE);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT || _la==BOO) {
				{
				{
				setState(130); field_decl();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << RETURN) | (1L << CONTINUE) | (1L << ALPHA))) != 0)) {
				{
				{
				setState(136); statement();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142); match(BRACE2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode BOO() { return getToken(DecafParser.BOO, 0); }
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==BOO) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public TerminalNode PARENTESIS(int i) {
			return getToken(DecafParser.PARENTESIS, i);
		}
		public TerminalNode BRAKET2() { return getToken(DecafParser.BRAKET2, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public TerminalNode BRACE() { return getToken(DecafParser.BRACE, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public TerminalNode EQ() { return getToken(DecafParser.EQ, 0); }
		public TerminalNode WHILE() { return getToken(DecafParser.WHILE, 0); }
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode BRACE2() { return getToken(DecafParser.BRACE2, 0); }
		public TerminalNode COMA() { return getToken(DecafParser.COMA, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public TerminalNode BRAKET() { return getToken(DecafParser.BRAKET, 0); }
		public List<TerminalNode> PARENTESIS() { return getTokens(DecafParser.PARENTESIS); }
		public TerminalNode PUNTOYCOMA() { return getToken(DecafParser.PUNTOYCOMA, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				{
				setState(146); location();
				}
				{
				setState(147); assign_op();
				}
				{
				setState(148); expr();
				}
				setState(149); match(PUNTOYCOMA);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(151); method_call();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(152); match(IF);
				setState(153); match(BRACE);
				{
				setState(154); expr();
				}
				setState(155); match(BRACE2);
				{
				setState(156); block();
				}
				{
				setState(157); match(ELSE);
				{
				setState(158); block();
				}
				}
				setState(160); match(PUNTOYCOMA);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(162); match(FOR);
				setState(163); match(PARENTESIS);
				{
				setState(164); id();
				}
				setState(165); match(EQ);
				{
				setState(166); expr();
				}
				setState(167); match(COMA);
				{
				setState(168); expr();
				}
				setState(169); match(PARENTESIS2);
				{
				setState(170); block();
				}
				setState(171); match(PUNTOYCOMA);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(173); match(WHILE);
				setState(174); match(PARENTESIS);
				{
				setState(175); expr();
				}
				setState(176); match(PARENTESIS);
				{
				setState(177); block();
				}
				setState(178); match(PUNTOYCOMA);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(180); match(RETURN);
				setState(181); match(BRAKET);
				{
				setState(182); expr();
				}
				setState(183); match(BRAKET2);
				setState(184); match(PUNTOYCOMA);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(186); match(CONTINUE);
				setState(187); match(PUNTOYCOMA);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_opContext extends ParserRuleContext {
		public TerminalNode PLEQ() { return getToken(DecafParser.PLEQ, 0); }
		public TerminalNode MIEQ() { return getToken(DecafParser.MIEQ, 0); }
		public TerminalNode EQ() { return getToken(DecafParser.EQ, 0); }
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAssign_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAssign_op(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PLEQ) | (1L << MIEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public List<Callout_argContext> callout_arg() {
			return getRuleContexts(Callout_argContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMA() { return getToken(DecafParser.COMA, 0); }
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public Method_nameContext method_name() {
			return getRuleContext(Method_nameContext.class,0);
		}
		public Callout_argContext callout_arg(int i) {
			return getRuleContext(Callout_argContext.class,i);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_call);
		int _la;
		try {
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(192); method_name();
				}
				setState(193); match(PARENTESIS);
				{
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(194); expr();
					}
					}
					setState(197); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << NO) | (1L << PARENTESIS) | (1L << ENTEROS) | (1L << ALPHA) | (1L << HEX) | (1L << CHAR) | (1L << BOOLEANS))) != 0) );
				setState(199); match(COMA);
				}
				setState(201); match(PARENTESIS2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(203); method_name();
				}
				setState(204); match(PARENTESIS);
				{
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(205); callout_arg();
					}
					}
					setState(208); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << SUB) | (1L << NO) | (1L << PARENTESIS) | (1L << ENTEROS) | (1L << ALPHA) | (1L << HEX) | (1L << CHAR) | (1L << BOOLEANS))) != 0) );
				setState(210); match(COMA);
				}
				setState(212); match(PARENTESIS2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Method_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethod_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethod_name(this);
		}
	}

	public final Method_nameContext method_name() throws RecognitionException {
		Method_nameContext _localctx = new Method_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_method_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(216); id();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BRAKET2() { return getToken(DecafParser.BRAKET2, 0); }
		public TerminalNode BRAKET() { return getToken(DecafParser.BRAKET, 0); }
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocation(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_location);
		try {
			setState(224);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(218); id();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(219); id();
				}
				setState(220); match(BRAKET);
				{
				setState(221); expr();
				}
				setState(222); match(BRAKET2);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExpleftContext expleft() {
			return getRuleContext(ExpleftContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode PARENTESIS(int i) {
			return getToken(DecafParser.PARENTESIS, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NO() { return getToken(DecafParser.NO, 0); }
		public List<TerminalNode> PARENTESIS() { return getTokens(DecafParser.PARENTESIS); }
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode SUB() { return getToken(DecafParser.SUB, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expr);
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(226); location();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(227); method_call();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(228); literal();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(229); expleft();
				}
				{
				setState(230); bin_op();
				}
				{
				setState(231); expr();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(233); match(SUB);
				{
				setState(234); expr();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(235); match(NO);
				{
				setState(236); expr();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(237); match(PARENTESIS);
				{
				setState(238); expr();
				}
				setState(239); match(PARENTESIS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpleftContext extends ParserRuleContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public TerminalNode PARENTESIS(int i) {
			return getToken(DecafParser.PARENTESIS, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NO() { return getToken(DecafParser.NO, 0); }
		public List<TerminalNode> PARENTESIS() { return getTokens(DecafParser.PARENTESIS); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode SUB() { return getToken(DecafParser.SUB, 0); }
		public ExpleftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expleft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpleft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpleft(this);
		}
	}

	public final ExpleftContext expleft() throws RecognitionException {
		ExpleftContext _localctx = new ExpleftContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expleft);
		try {
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(243); location();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(244); method_call();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(245); literal();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246); match(SUB);
				{
				setState(247); expr();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(248); match(NO);
				{
				setState(249); expr();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(250); match(PARENTESIS);
				{
				setState(251); expr();
				}
				setState(252); match(PARENTESIS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Callout_argContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public String_literalContext string_literal() {
			return getRuleContext(String_literalContext.class,0);
		}
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCallout_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCallout_arg(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callout_arg);
		try {
			setState(258);
			switch (_input.LA(1)) {
			case SUB:
			case NO:
			case PARENTESIS:
			case ENTEROS:
			case ALPHA:
			case HEX:
			case CHAR:
			case BOOLEANS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(256); expr();
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(257); string_literal();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bin_opContext extends ParserRuleContext {
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBin_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBin_op(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bin_op);
		try {
			setState(264);
			switch (_input.LA(1)) {
			case PLUS:
			case MULT:
			case DIV:
			case SUB:
			case PER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(260); arith_op();
				}
				}
				break;
			case MAY:
			case MEN:
			case MAEQ:
			case MEEQ:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(261); rel_op();
				}
				}
				break;
			case EQQ:
			case NOEQ:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(262); eq_op();
				}
				}
				break;
			case ANDD:
			case ORR:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(263); cond_op();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arith_opContext extends ParserRuleContext {
		public TerminalNode DIV() { return getToken(DecafParser.DIV, 0); }
		public TerminalNode MULT() { return getToken(DecafParser.MULT, 0); }
		public TerminalNode PER() { return getToken(DecafParser.PER, 0); }
		public TerminalNode PLUS() { return getToken(DecafParser.PLUS, 0); }
		public TerminalNode SUB() { return getToken(DecafParser.SUB, 0); }
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterArith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitArith_op(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MULT) | (1L << DIV) | (1L << SUB) | (1L << PER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rel_opContext extends ParserRuleContext {
		public TerminalNode MAEQ() { return getToken(DecafParser.MAEQ, 0); }
		public TerminalNode MAY() { return getToken(DecafParser.MAY, 0); }
		public TerminalNode MEEQ() { return getToken(DecafParser.MEEQ, 0); }
		public TerminalNode MEN() { return getToken(DecafParser.MEN, 0); }
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterRel_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitRel_op(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rel_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAY) | (1L << MEN) | (1L << MAEQ) | (1L << MEEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Eq_opContext extends ParserRuleContext {
		public TerminalNode EQQ() { return getToken(DecafParser.EQQ, 0); }
		public TerminalNode NOEQ() { return getToken(DecafParser.NOEQ, 0); }
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterEq_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitEq_op(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_eq_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_la = _input.LA(1);
			if ( !(_la==EQQ || _la==NOEQ) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cond_opContext extends ParserRuleContext {
		public TerminalNode ORR() { return getToken(DecafParser.ORR, 0); }
		public TerminalNode ANDD() { return getToken(DecafParser.ANDD, 0); }
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCond_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCond_op(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cond_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			_la = _input.LA(1);
			if ( !(_la==ANDD || _la==ORR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public Char_literalContext char_literal() {
			return getRuleContext(Char_literalContext.class,0);
		}
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public Bool_literalContext bool_literal() {
			return getRuleContext(Bool_literalContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_literal);
		try {
			setState(277);
			switch (_input.LA(1)) {
			case ENTEROS:
			case HEX:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(274); int_literal();
				}
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(275); char_literal();
				}
				}
				break;
			case BOOLEANS:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(276); bool_literal();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public Alpha_numContext alpha_num(int i) {
			return getRuleContext(Alpha_numContext.class,i);
		}
		public AlphaContext alpha() {
			return getRuleContext(AlphaContext.class,0);
		}
		public List<Alpha_numContext> alpha_num() {
			return getRuleContexts(Alpha_numContext.class);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_id);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(279); alpha();
			}
			setState(283);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(280); alpha_num();
					}
					} 
				}
				setState(285);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alpha_numContext extends ParserRuleContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public AlphaContext alpha() {
			return getRuleContext(AlphaContext.class,0);
		}
		public Alpha_numContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAlpha_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAlpha_num(this);
		}
	}

	public final Alpha_numContext alpha_num() throws RecognitionException {
		Alpha_numContext _localctx = new Alpha_numContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_alpha_num);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case ALPHA:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(286); alpha();
				}
				}
				break;
			case ENTEROS:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(287); digit();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlphaContext extends ParserRuleContext {
		public TerminalNode ALPHA() { return getToken(DecafParser.ALPHA, 0); }
		public AlphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAlpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAlpha(this);
		}
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_alpha);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); match(ALPHA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DigitContext extends ParserRuleContext {
		public TerminalNode ENTEROS() { return getToken(DecafParser.ENTEROS, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitDigit(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292); match(ENTEROS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hex_digitContext extends ParserRuleContext {
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public TerminalNode AF() { return getToken(DecafParser.AF, 0); }
		public Hex_digitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterHex_digit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitHex_digit(this);
		}
	}

	public final Hex_digitContext hex_digit() throws RecognitionException {
		Hex_digitContext _localctx = new Hex_digitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_hex_digit);
		try {
			setState(296);
			switch (_input.LA(1)) {
			case ENTEROS:
				enterOuterAlt(_localctx, 1);
				{
				setState(294); digit();
				}
				break;
			case AF:
				enterOuterAlt(_localctx, 2);
				{
				setState(295); match(AF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Int_literalContext extends ParserRuleContext {
		public Decimal_literalContext decimal_literal() {
			return getRuleContext(Decimal_literalContext.class,0);
		}
		public Hex_literalContext hex_literal() {
			return getRuleContext(Hex_literalContext.class,0);
		}
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterInt_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitInt_literal(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_int_literal);
		try {
			setState(300);
			switch (_input.LA(1)) {
			case ENTEROS:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(298); decimal_literal();
				}
				}
				break;
			case HEX:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(299); hex_literal();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decimal_literalContext extends ParserRuleContext {
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public Decimal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterDecimal_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitDecimal_literal(this);
		}
	}

	public final Decimal_literalContext decimal_literal() throws RecognitionException {
		Decimal_literalContext _localctx = new Decimal_literalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_decimal_literal);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(302); digit();
			}
			setState(306);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(303); digit();
					}
					} 
				}
				setState(308);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hex_literalContext extends ParserRuleContext {
		public TerminalNode HEX() { return getToken(DecafParser.HEX, 0); }
		public Hex_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hex_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterHex_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitHex_literal(this);
		}
	}

	public final Hex_literalContext hex_literal() throws RecognitionException {
		Hex_literalContext _localctx = new Hex_literalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_hex_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309); match(HEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_literalContext extends ParserRuleContext {
		public TerminalNode BOOLEANS() { return getToken(DecafParser.BOOLEANS, 0); }
		public Bool_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBool_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBool_literal(this);
		}
	}

	public final Bool_literalContext bool_literal() throws RecognitionException {
		Bool_literalContext _localctx = new Bool_literalContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bool_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311); match(BOOLEANS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Char_literalContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(DecafParser.CHAR, 0); }
		public Char_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_char_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterChar_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitChar_literal(this);
		}
	}

	public final Char_literalContext char_literal() throws RecognitionException {
		Char_literalContext _localctx = new Char_literalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_char_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_literalContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(DecafParser.STRING, 0); }
		public String_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterString_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitString_literal(this);
		}
	}

	public final String_literalContext string_literal() throws RecognitionException {
		String_literalContext _localctx = new String_literalContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_string_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u0140\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2J\n\2\3\3\7\3M\n\3\f\3\16\3P\13\3\3"+
		"\3\7\3S\n\3\f\3\16\3V\13\3\3\3\7\3Y\n\3\f\3\16\3\\\13\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5i\n\5\r\5\16\5j\3\5\3\5\3\5\5\5p\n\5"+
		"\3\6\3\6\5\6t\n\6\3\6\3\6\3\6\3\6\3\6\6\6{\n\6\r\6\16\6|\3\6\3\6\3\6\3"+
		"\6\3\6\3\7\3\7\7\7\u0086\n\7\f\7\16\7\u0089\13\7\3\7\7\7\u008c\n\7\f\7"+
		"\16\7\u008f\13\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bf"+
		"\n\t\3\n\3\n\3\13\3\13\3\13\6\13\u00c6\n\13\r\13\16\13\u00c7\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\6\13\u00d1\n\13\r\13\16\13\u00d2\3\13\3\13\3"+
		"\13\3\13\5\13\u00d9\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e3\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00f4\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0101\n\17\3\20\3\20\5\20\u0105\n\20\3\21\3\21\3\21\3\21\5"+
		"\21\u010b\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\5\26\u0118\n\26\3\27\3\27\7\27\u011c\n\27\f\27\16\27\u011f\13\27\3\30"+
		"\3\30\5\30\u0123\n\30\3\31\3\31\3\32\3\32\3\33\3\33\5\33\u012b\n\33\3"+
		"\34\3\34\5\34\u012f\n\34\3\35\3\35\7\35\u0133\n\35\f\35\16\35\u0136\13"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\b\3\2\33\34\4\2\r\r\30\31\4\2"+
		"\7\n\16\16\3\2\17\22\3\2\23\24\3\2\25\26\u014e\2I\3\2\2\2\4N\3\2\2\2\6"+
		"]\3\2\2\2\ba\3\2\2\2\ns\3\2\2\2\f\u0083\3\2\2\2\16\u0092\3\2\2\2\20\u00be"+
		"\3\2\2\2\22\u00c0\3\2\2\2\24\u00d8\3\2\2\2\26\u00da\3\2\2\2\30\u00e2\3"+
		"\2\2\2\32\u00f3\3\2\2\2\34\u0100\3\2\2\2\36\u0104\3\2\2\2 \u010a\3\2\2"+
		"\2\"\u010c\3\2\2\2$\u010e\3\2\2\2&\u0110\3\2\2\2(\u0112\3\2\2\2*\u0117"+
		"\3\2\2\2,\u0119\3\2\2\2.\u0122\3\2\2\2\60\u0124\3\2\2\2\62\u0126\3\2\2"+
		"\2\64\u012a\3\2\2\2\66\u012e\3\2\2\28\u0130\3\2\2\2:\u0137\3\2\2\2<\u0139"+
		"\3\2\2\2>\u013b\3\2\2\2@\u013d\3\2\2\2BJ\5\4\3\2CJ\5\6\4\2DJ\5\b\5\2E"+
		"J\5\n\6\2FJ\5\f\7\2GJ\5\16\b\2HJ\5\20\t\2IB\3\2\2\2IC\3\2\2\2ID\3\2\2"+
		"\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\3\3\2\2\2KM\5\6\4\2LK\3\2"+
		"\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OT\3\2\2\2PN\3\2\2\2QS\5\b\5\2RQ\3\2"+
		"\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UZ\3\2\2\2VT\3\2\2\2WY\5\n\6\2XW\3\2"+
		"\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\5\3\2\2\2\\Z\3\2\2\2]^\7$\2\2^_\5"+
		",\27\2_`\7/\2\2`\7\3\2\2\2ao\5\16\b\2bp\5,\27\2cd\5,\27\2de\7-\2\2ef\5"+
		"\66\34\2fg\7.\2\2gi\3\2\2\2hc\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl"+
		"\3\2\2\2lm\7(\2\2mn\7*\2\2np\3\2\2\2ob\3\2\2\2oh\3\2\2\2p\t\3\2\2\2qt"+
		"\5\16\b\2rt\7#\2\2sq\3\2\2\2sr\3\2\2\2tu\3\2\2\2uv\5,\27\2vz\7\60\2\2"+
		"wx\5\16\b\2xy\5,\27\2y{\3\2\2\2zw\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2"+
		"\2}~\3\2\2\2~\177\7(\2\2\177\u0080\3\2\2\2\u0080\u0081\7\61\2\2\u0081"+
		"\u0082\5\f\7\2\u0082\13\3\2\2\2\u0083\u0087\7+\2\2\u0084\u0086\5\b\5\2"+
		"\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u008d\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008c\5\20\t\2"+
		"\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7,\2\2\u0091"+
		"\r\3\2\2\2\u0092\u0093\t\2\2\2\u0093\17\3\2\2\2\u0094\u0095\5\30\r\2\u0095"+
		"\u0096\5\22\n\2\u0096\u0097\5\32\16\2\u0097\u0098\7/\2\2\u0098\u00bf\3"+
		"\2\2\2\u0099\u00bf\5\24\13\2\u009a\u009b\7\36\2\2\u009b\u009c\7+\2\2\u009c"+
		"\u009d\5\32\16\2\u009d\u009e\7,\2\2\u009e\u009f\5\f\7\2\u009f\u00a0\7"+
		"&\2\2\u00a0\u00a1\5\f\7\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7/\2\2\u00a3"+
		"\u00bf\3\2\2\2\u00a4\u00a5\7\37\2\2\u00a5\u00a6\7\60\2\2\u00a6\u00a7\5"+
		",\27\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9\5\32\16\2\u00a9\u00aa\7(\2\2\u00aa"+
		"\u00ab\5\32\16\2\u00ab\u00ac\7\61\2\2\u00ac\u00ad\5\f\7\2\u00ad\u00ae"+
		"\7/\2\2\u00ae\u00bf\3\2\2\2\u00af\u00b0\7 \2\2\u00b0\u00b1\7\60\2\2\u00b1"+
		"\u00b2\5\32\16\2\u00b2\u00b3\7\60\2\2\u00b3\u00b4\5\f\7\2\u00b4\u00b5"+
		"\7/\2\2\u00b5\u00bf\3\2\2\2\u00b6\u00b7\7!\2\2\u00b7\u00b8\7-\2\2\u00b8"+
		"\u00b9\5\32\16\2\u00b9\u00ba\7.\2\2\u00ba\u00bb\7/\2\2\u00bb\u00bf\3\2"+
		"\2\2\u00bc\u00bd\7%\2\2\u00bd\u00bf\7/\2\2\u00be\u0094\3\2\2\2\u00be\u0099"+
		"\3\2\2\2\u00be\u009a\3\2\2\2\u00be\u00a4\3\2\2\2\u00be\u00af\3\2\2\2\u00be"+
		"\u00b6\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\21\3\2\2\2\u00c0\u00c1\t\3\2"+
		"\2\u00c1\23\3\2\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c5\7\60\2\2\u00c4\u00c6"+
		"\5\32\16\2\u00c5\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7(\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cc\7\61\2\2\u00cc\u00d9\3\2\2\2\u00cd\u00ce\5\26\f\2"+
		"\u00ce\u00d0\7\60\2\2\u00cf\u00d1\5\36\20\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00d5\7(\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\61\2\2\u00d7"+
		"\u00d9\3\2\2\2\u00d8\u00c2\3\2\2\2\u00d8\u00cd\3\2\2\2\u00d9\25\3\2\2"+
		"\2\u00da\u00db\5,\27\2\u00db\27\3\2\2\2\u00dc\u00e3\5,\27\2\u00dd\u00de"+
		"\5,\27\2\u00de\u00df\7-\2\2\u00df\u00e0\5\32\16\2\u00e0\u00e1\7.\2\2\u00e1"+
		"\u00e3\3\2\2\2\u00e2\u00dc\3\2\2\2\u00e2\u00dd\3\2\2\2\u00e3\31\3\2\2"+
		"\2\u00e4\u00f4\5\30\r\2\u00e5\u00f4\5\24\13\2\u00e6\u00f4\5*\26\2\u00e7"+
		"\u00e8\5\34\17\2\u00e8\u00e9\5 \21\2\u00e9\u00ea\5\32\16\2\u00ea\u00f4"+
		"\3\2\2\2\u00eb\u00ec\7\n\2\2\u00ec\u00f4\5\32\16\2\u00ed\u00ee\7\32\2"+
		"\2\u00ee\u00f4\5\32\16\2\u00ef\u00f0\7\60\2\2\u00f0\u00f1\5\32\16\2\u00f1"+
		"\u00f2\7\60\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00e4\3\2\2\2\u00f3\u00e5\3"+
		"\2\2\2\u00f3\u00e6\3\2\2\2\u00f3\u00e7\3\2\2\2\u00f3\u00eb\3\2\2\2\u00f3"+
		"\u00ed\3\2\2\2\u00f3\u00ef\3\2\2\2\u00f4\33\3\2\2\2\u00f5\u0101\5\30\r"+
		"\2\u00f6\u0101\5\24\13\2\u00f7\u0101\5*\26\2\u00f8\u00f9\7\n\2\2\u00f9"+
		"\u0101\5\32\16\2\u00fa\u00fb\7\32\2\2\u00fb\u0101\5\32\16\2\u00fc\u00fd"+
		"\7\60\2\2\u00fd\u00fe\5\32\16\2\u00fe\u00ff\7\60\2\2\u00ff\u0101\3\2\2"+
		"\2\u0100\u00f5\3\2\2\2\u0100\u00f6\3\2\2\2\u0100\u00f7\3\2\2\2\u0100\u00f8"+
		"\3\2\2\2\u0100\u00fa\3\2\2\2\u0100\u00fc\3\2\2\2\u0101\35\3\2\2\2\u0102"+
		"\u0105\5\32\16\2\u0103\u0105\5@!\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2"+
		"\2\2\u0105\37\3\2\2\2\u0106\u010b\5\"\22\2\u0107\u010b\5$\23\2\u0108\u010b"+
		"\5&\24\2\u0109\u010b\5(\25\2\u010a\u0106\3\2\2\2\u010a\u0107\3\2\2\2\u010a"+
		"\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b!\3\2\2\2\u010c\u010d\t\4\2\2"+
		"\u010d#\3\2\2\2\u010e\u010f\t\5\2\2\u010f%\3\2\2\2\u0110\u0111\t\6\2\2"+
		"\u0111\'\3\2\2\2\u0112\u0113\t\7\2\2\u0113)\3\2\2\2\u0114\u0118\5\66\34"+
		"\2\u0115\u0118\5> \2\u0116\u0118\5<\37\2\u0117\u0114\3\2\2\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0116\3\2\2\2\u0118+\3\2\2\2\u0119\u011d\5\60\31\2\u011a"+
		"\u011c\5.\30\2\u011b\u011a\3\2\2\2\u011c\u011f\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e-\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0123"+
		"\5\60\31\2\u0121\u0123\5\62\32\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2\2"+
		"\2\u0123/\3\2\2\2\u0124\u0125\7\63\2\2\u0125\61\3\2\2\2\u0126\u0127\7"+
		"\62\2\2\u0127\63\3\2\2\2\u0128\u012b\5\62\32\2\u0129\u012b\7\'\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u0129\3\2\2\2\u012b\65\3\2\2\2\u012c\u012f\58\35"+
		"\2\u012d\u012f\5:\36\2\u012e\u012c\3\2\2\2\u012e\u012d\3\2\2\2\u012f\67"+
		"\3\2\2\2\u0130\u0134\5\62\32\2\u0131\u0133\5\62\32\2\u0132\u0131\3\2\2"+
		"\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u01359"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7\65\2\2\u0138;\3\2\2\2\u0139"+
		"\u013a\7\67\2\2\u013a=\3\2\2\2\u013b\u013c\7\66\2\2\u013c?\3\2\2\2\u013d"+
		"\u013e\7\6\2\2\u013eA\3\2\2\2\33INTZjos|\u0087\u008d\u00be\u00c7\u00d2"+
		"\u00d8\u00e2\u00f3\u0100\u0104\u010a\u0117\u011d\u0122\u012a\u012e\u0134";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}