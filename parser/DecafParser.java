// Generated from parser\DecafParser.g by ANTLR 4.4

  package compiler.parser;
  import java.util.*;

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
		RET=4, ERRTC=20, IDB=71, NOEQ=36, PLEQ=40, ERRSQ=14, MULT=24, SEMICOLON=58, 
		BREAK=50, ELSE=54, ID=70, IF=46, COMA=56, SUB=26, BOO=44, EQQ=35, DOT=5, 
		DIAGS=10, FOR=47, EQ=29, ERRSTRING=13, ERRNL=16, AND=27, MEN=32, ERRHEXND=21, 
		VOID=51, NL=2, BRACE2=60, PLUS=23, NO=42, FLOTANTES=66, FLOAT=45, ERRMCHAR=19, 
		MAY=31, CHAR=68, ORR=38, INT=43, COMMENT=55, ERRIF=22, RETURN=49, ERRNBS=18, 
		ERRNSCOMF=17, NLS=7, RETS=9, BRAKET2=62, TABS=8, ERRINBS=15, PARENTESIS2=64, 
		BRACE=59, WS=1, PARENTESIS=63, MEEQ=34, OR=28, MAEQ=33, COS=11, COLON=57, 
		BRAKET=61, MIEQ=41, CALLOUT=52, DIV=25, CONTINUE=53, ANDD=37, BOOLEANS=69, 
		TAB=3, ENTEROS=65, WSS=6, STRING=12, WHILE=48, HEX=67, PER=30, EXP=39;
	public static final String[] tokenNames = {
		"<INVALID>", "WS", "NL", "TAB", "RET", "'.'", "WSS", "NLS", "TABS", "RETS", 
		"DIAGS", "COS", "STRING", "ERRSTRING", "ERRSQ", "ERRINBS", "ERRNL", "ERRNSCOMF", 
		"ERRNBS", "ERRMCHAR", "ERRTC", "'0x'", "ERRIF", "'+'", "'*'", "'/'", "'-'", 
		"'&'", "'|'", "'='", "'%'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", 
		"'&&'", "'||'", "'^'", "'+='", "'-='", "'!'", "'int'", "'boolean'", "'float'", 
		"'if'", "'for'", "'while'", "'return'", "'break'", "'void'", "'callout'", 
		"'continue'", "'else'", "COMMENT", "','", "':'", "';'", "'{'", "'}'", 
		"'['", "']'", "'('", "')'", "ENTEROS", "FLOTANTES", "HEX", "CHAR", "BOOLEANS", 
		"ID", "IDB"
	};
	public static final int
		RULE_start = 0, RULE_program = 1, RULE_type = 2, RULE_callout_decl = 3, 
		RULE_field_decl = 4, RULE_method_decl = 5, RULE_block = 6, RULE_statement = 7, 
		RULE_assign_op = 8, RULE_method_call = 9, RULE_location = 10, RULE_expr = 11, 
		RULE_expleft = 12, RULE_callout_arg = 13, RULE_bin_op = 14, RULE_arith_op = 15, 
		RULE_rel_op = 16, RULE_eq_op = 17, RULE_cond_op = 18, RULE_literal = 19, 
		RULE_int_literal = 20, RULE_decimal_literal = 21;
	public static final String[] ruleNames = {
		"start", "program", "type", "callout_decl", "field_decl", "method_decl", 
		"block", "statement", "assign_op", "method_call", "location", "expr", 
		"expleft", "callout_arg", "bin_op", "arith_op", "rel_op", "eq_op", "cond_op", 
		"literal", "int_literal", "decimal_literal"
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


		public LinkedList<String> list = new LinkedList<String>();

	  	public LinkedList<String> getlist(){
	  		return list;
	  	}

	public DecafParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); program();
			list.add("start");
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
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProgContext extends ProgramContext {
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public List<Method_declContext> method_decl() {
			return getRuleContexts(Method_declContext.class);
		}
		public List<Callout_declContext> callout_decl() {
			return getRuleContexts(Callout_declContext.class);
		}
		public Callout_declContext callout_decl(int i) {
			return getRuleContext(Callout_declContext.class,i);
		}
		public Method_declContext method_decl(int i) {
			return getRuleContext(Method_declContext.class,i);
		}
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public ProgContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			_localctx = new ProgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CALLOUT) {
				{
				{
				setState(47); callout_decl();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(53); field_decl();
					}
					} 
				}
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOO) | (1L << VOID))) != 0)) {
				{
				{
				setState(59); method_decl();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			list.add("program");
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TipoContext extends TypeContext {
		public TerminalNode BOO() { return getToken(DecafParser.BOO, 0); }
		public TerminalNode INT() { return getToken(DecafParser.INT, 0); }
		public TipoContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		int _la;
		try {
			_localctx = new TipoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==BOO) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			list.add("type");
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
		public Callout_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_decl; }
	 
		public Callout_declContext() { }
		public void copyFrom(Callout_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CalloutDecContext extends Callout_declContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public TerminalNode CALLOUT() { return getToken(DecafParser.CALLOUT, 0); }
		public CalloutDecContext(Callout_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCalloutDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCalloutDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitCalloutDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callout_declContext callout_decl() throws RecognitionException {
		Callout_declContext _localctx = new Callout_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_callout_decl);
		try {
			_localctx = new CalloutDecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(CALLOUT);
			setState(71); match(ID);
			setState(72); match(SEMICOLON);
			list.add("callout_decl");
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
		public Field_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field_decl; }
	 
		public Field_declContext() { }
		public void copyFrom(Field_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldDecContext extends Field_declContext {
		public TerminalNode BRAKET2(int i) {
			return getToken(DecafParser.BRAKET2, i);
		}
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TerminalNode IDB(int i) {
			return getToken(DecafParser.IDB, i);
		}
		public List<Int_literalContext> int_literal() {
			return getRuleContexts(Int_literalContext.class);
		}
		public Int_literalContext int_literal(int i) {
			return getRuleContext(Int_literalContext.class,i);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public List<TerminalNode> BRAKET2() { return getTokens(DecafParser.BRAKET2); }
		public TerminalNode COMA() { return getToken(DecafParser.COMA, 0); }
		public List<TerminalNode> IDB() { return getTokens(DecafParser.IDB); }
		public FieldDecContext(Field_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterFieldDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitFieldDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitFieldDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Field_declContext field_decl() throws RecognitionException {
		Field_declContext _localctx = new Field_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field_decl);
		int _la;
		try {
			_localctx = new FieldDecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			switch (_input.LA(1)) {
			case INT:
			case BOO:
				{
				setState(75); type();
				}
				break;
			case VOID:
				{
				setState(76); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(84);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(79); match(ID);
				}
				break;
			case IDB:
				{
				setState(80); match(IDB);
				setState(81); int_literal();
				setState(82); match(BRAKET2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(97);
			_la = _input.LA(1);
			if (_la==COMA) {
				{
				setState(86); match(COMA);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID || _la==IDB) {
					{
					setState(92);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(87); match(ID);
						}
						break;
					case IDB:
						{
						setState(88); match(IDB);
						setState(89); int_literal();
						setState(90); match(BRAKET2);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(99); match(SEMICOLON);
			list.add("field_decl");
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
		public Method_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_decl; }
	 
		public Method_declContext() { }
		public void copyFrom(Method_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodDecContext extends Method_declContext {
		public List<TerminalNode> ID() { return getTokens(DecafParser.ID); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode VOID() { return getToken(DecafParser.VOID, 0); }
		public TerminalNode COMA(int i) {
			return getToken(DecafParser.COMA, i);
		}
		public TerminalNode ID(int i) {
			return getToken(DecafParser.ID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public List<TerminalNode> COMA() { return getTokens(DecafParser.COMA); }
		public MethodDecContext(Method_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethodDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethodDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMethodDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declContext method_decl() throws RecognitionException {
		Method_declContext _localctx = new Method_declContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_decl);
		int _la;
		try {
			_localctx = new MethodDecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(104);
			switch (_input.LA(1)) {
			case INT:
			case BOO:
				{
				setState(102); type();
				}
				break;
			case VOID:
				{
				setState(103); match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(106); match(ID);
			setState(107); match(PARENTESIS);
			setState(119);
			_la = _input.LA(1);
			if (_la==INT || _la==BOO) {
				{
				setState(108); type();
				setState(109); match(ID);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(110); match(COMA);
					setState(111); type();
					setState(112); match(ID);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(121); match(PARENTESIS2);
			setState(122); block();
			}
			list.add("method_decl");
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
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BloqueContext extends BlockContext {
		public Field_declContext field_decl(int i) {
			return getRuleContext(Field_declContext.class,i);
		}
		public TerminalNode BRACE2() { return getToken(DecafParser.BRACE2, 0); }
		public TerminalNode BRACE() { return getToken(DecafParser.BRACE, 0); }
		public List<Field_declContext> field_decl() {
			return getRuleContexts(Field_declContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BloqueContext(BlockContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			_localctx = new BloqueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(BRACE);
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOO) | (1L << VOID))) != 0)) {
				{
				{
				setState(127); field_decl();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (IF - 46)) | (1L << (FOR - 46)) | (1L << (WHILE - 46)) | (1L << (RETURN - 46)) | (1L << (CONTINUE - 46)) | (1L << (ID - 46)))) != 0)) {
				{
				{
				setState(133); statement();
				}
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(139); match(BRACE2);
			list.add("block");
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SifContext extends StatementContext {
		public TerminalNode ELSE() { return getToken(DecafParser.ELSE, 0); }
		public TerminalNode IF() { return getToken(DecafParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public SifContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterSif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitSif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitSif(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SforContext extends StatementContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode FOR() { return getToken(DecafParser.FOR, 0); }
		public TerminalNode EQ() { return getToken(DecafParser.EQ, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public TerminalNode COMA() { return getToken(DecafParser.COMA, 0); }
		public SforContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterSfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitSfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitSfor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwhileContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(DecafParser.WHILE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public SwhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterSwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitSwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitSwhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ScontinueContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public TerminalNode CONTINUE() { return getToken(DecafParser.CONTINUE, 0); }
		public ScontinueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterScontinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitScontinue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitScontinue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsignaContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public Assign_opContext assign_op() {
			return getRuleContext(Assign_opContext.class,0);
		}
		public AsignaContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAsigna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAsigna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitAsigna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SreturnContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(DecafParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SreturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterSreturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitSreturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitSreturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MetodoContext extends StatementContext {
		public TerminalNode SEMICOLON() { return getToken(DecafParser.SEMICOLON, 0); }
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public MetodoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new AsignaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(142); location();
				setState(143); assign_op();
				setState(144); expr();
				setState(145); match(SEMICOLON);
				}
				}
				break;
			case 2:
				_localctx = new MetodoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(147); method_call();
				setState(148); match(SEMICOLON);
				}
				}
				break;
			case 3:
				_localctx = new SifContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(150); match(IF);
				setState(151); match(PARENTESIS);
				setState(152); expr();
				setState(153); match(PARENTESIS2);
				setState(154); block();
				setState(157);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(155); match(ELSE);
					{
					setState(156); block();
					}
					}
				}

				}
				}
				break;
			case 4:
				_localctx = new SforContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(159); match(FOR);
				setState(160); match(PARENTESIS);
				setState(161); match(ID);
				setState(162); match(EQ);
				setState(163); expr();
				setState(164); match(COMA);
				setState(165); expr();
				setState(166); match(PARENTESIS2);
				setState(167); block();
				}
				}
				break;
			case 5:
				_localctx = new SwhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(169); match(WHILE);
				setState(170); match(PARENTESIS);
				setState(171); expr();
				setState(172); match(PARENTESIS2);
				setState(173); block();
				}
				}
				break;
			case 6:
				_localctx = new SreturnContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(175); match(RETURN);
				setState(177);
				_la = _input.LA(1);
				if (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & ((1L << (SUB - 26)) | (1L << (NO - 26)) | (1L << (PARENTESIS - 26)) | (1L << (ENTEROS - 26)) | (1L << (HEX - 26)) | (1L << (CHAR - 26)) | (1L << (BOOLEANS - 26)) | (1L << (ID - 26)))) != 0)) {
					{
					setState(176); expr();
					}
				}

				setState(179); match(SEMICOLON);
				}
				}
				break;
			case 7:
				_localctx = new ScontinueContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(180); match(CONTINUE);
				setState(181); match(SEMICOLON);
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
			list.add("statement");
			exitRule();
		}
		return _localctx;
	}

	public static class Assign_opContext extends ParserRuleContext {
		public Assign_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_op; }
	 
		public Assign_opContext() { }
		public void copyFrom(Assign_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssingOPContext extends Assign_opContext {
		public TerminalNode PLEQ() { return getToken(DecafParser.PLEQ, 0); }
		public TerminalNode MIEQ() { return getToken(DecafParser.MIEQ, 0); }
		public TerminalNode EQ() { return getToken(DecafParser.EQ, 0); }
		public AssingOPContext(Assign_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterAssingOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitAssingOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitAssingOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_opContext assign_op() throws RecognitionException {
		Assign_opContext _localctx = new Assign_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign_op);
		int _la;
		try {
			_localctx = new AssingOPContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << PLEQ) | (1L << MIEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			list.add("assign_op");
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
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	 
		public Method_callContext() { }
		public void copyFrom(Method_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MethodCallContext extends Method_callContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode STRING(int i) {
			return getToken(DecafParser.STRING, i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COMA(int i) {
			return getToken(DecafParser.COMA, i);
		}
		public List<TerminalNode> STRING() { return getTokens(DecafParser.STRING); }
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public List<TerminalNode> COMA() { return getTokens(DecafParser.COMA); }
		public MethodCallContext(Method_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_call);
		int _la;
		try {
			_localctx = new MethodCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(ID);
			setState(188); match(PARENTESIS);
			setState(203);
			_la = _input.LA(1);
			if (((((_la - 12)) & ~0x3f) == 0 && ((1L << (_la - 12)) & ((1L << (STRING - 12)) | (1L << (SUB - 12)) | (1L << (NO - 12)) | (1L << (PARENTESIS - 12)) | (1L << (ENTEROS - 12)) | (1L << (HEX - 12)) | (1L << (CHAR - 12)) | (1L << (BOOLEANS - 12)) | (1L << (ID - 12)))) != 0)) {
				{
				setState(191);
				switch (_input.LA(1)) {
				case SUB:
				case NO:
				case PARENTESIS:
				case ENTEROS:
				case HEX:
				case CHAR:
				case BOOLEANS:
				case ID:
					{
					setState(189); expr();
					}
					break;
				case STRING:
					{
					setState(190); match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(193); match(COMA);
					setState(196);
					switch (_input.LA(1)) {
					case SUB:
					case NO:
					case PARENTESIS:
					case ENTEROS:
					case HEX:
					case CHAR:
					case BOOLEANS:
					case ID:
						{
						setState(194); expr();
						}
						break;
					case STRING:
						{
						setState(195); match(STRING);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(205); match(PARENTESIS2);
			list.add("method_call");
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
		public LocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_location; }
	 
		public LocationContext() { }
		public void copyFrom(LocationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LocacionContext extends LocationContext {
		public TerminalNode ID() { return getToken(DecafParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BRAKET2() { return getToken(DecafParser.BRAKET2, 0); }
		public TerminalNode BRAKET() { return getToken(DecafParser.BRAKET, 0); }
		public LocacionContext(LocationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLocacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLocacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLocacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationContext location() throws RecognitionException {
		LocationContext _localctx = new LocationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_location);
		try {
			_localctx = new LocacionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				{
				setState(208); match(ID);
				}
				}
				break;
			case 2:
				{
				{
				{
				setState(209); match(ID);
				}
				setState(210); match(BRAKET);
				{
				setState(211); expr();
				}
				setState(212); match(BRAKET2);
				}
				}
				break;
			}
			list.add("location");
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpMethContext extends ExprContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public ExpMethContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpMeth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpMeth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExpMeth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpParentContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public ExpParentContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExpParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpLitContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpLitContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExpLit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpOPContext extends ExprContext {
		public Bin_opContext bin_op() {
			return getRuleContext(Bin_opContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpleftContext expleft() {
			return getRuleContext(ExpleftContext.class,0);
		}
		public ExpOPContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExpOP(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpNoContext extends ExprContext {
		public TerminalNode NO() { return getToken(DecafParser.NO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpNoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpNo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExpNo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpLocContext extends ExprContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExpLocContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExpLoc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpSubContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(DecafParser.SUB, 0); }
		public ExpSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExpSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExpSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExpSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expr);
		try {
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new ExpLocContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(218); location();
				}
				break;
			case 2:
				_localctx = new ExpMethContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(219); method_call();
				}
				break;
			case 3:
				_localctx = new ExpLitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(220); literal();
				}
				break;
			case 4:
				_localctx = new ExpOPContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(221); expleft();
				setState(222); bin_op();
				setState(223); expr();
				}
				}
				break;
			case 5:
				_localctx = new ExpSubContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(225); match(SUB);
				setState(226); expr();
				}
				}
				break;
			case 6:
				_localctx = new ExpNoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(227); match(NO);
				setState(228); expr();
				}
				}
				break;
			case 7:
				_localctx = new ExpParentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(229); match(PARENTESIS);
				setState(230); expr();
				setState(231); match(PARENTESIS2);
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
			list.add("expr");
			exitRule();
		}
		return _localctx;
	}

	public static class ExpleftContext extends ParserRuleContext {
		public ExpleftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expleft; }
	 
		public ExpleftContext() { }
		public void copyFrom(ExpleftContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplLocContext extends ExpleftContext {
		public LocationContext location() {
			return getRuleContext(LocationContext.class,0);
		}
		public ExplLocContext(ExpleftContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExplLoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExplLoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExplLoc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplSubContext extends ExpleftContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SUB() { return getToken(DecafParser.SUB, 0); }
		public ExplSubContext(ExpleftContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExplSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExplSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExplSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplNoContext extends ExpleftContext {
		public TerminalNode NO() { return getToken(DecafParser.NO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExplNoContext(ExpleftContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExplNo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExplNo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExplNo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplParentContext extends ExpleftContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PARENTESIS2() { return getToken(DecafParser.PARENTESIS2, 0); }
		public TerminalNode PARENTESIS() { return getToken(DecafParser.PARENTESIS, 0); }
		public ExplParentContext(ExpleftContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExplParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExplParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExplParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplMethContext extends ExpleftContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public ExplMethContext(ExpleftContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExplMeth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExplMeth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExplMeth(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplLitContext extends ExpleftContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExplLitContext(ExpleftContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterExplLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitExplLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitExplLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpleftContext expleft() throws RecognitionException {
		ExpleftContext _localctx = new ExpleftContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expleft);
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ExplLocContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(235); location();
				}
				break;
			case 2:
				_localctx = new ExplMethContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236); method_call();
				}
				break;
			case 3:
				_localctx = new ExplLitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(237); literal();
				}
				break;
			case 4:
				_localctx = new ExplSubContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(238); match(SUB);
				setState(239); expr();
				}
				}
				break;
			case 5:
				_localctx = new ExplNoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(240); match(NO);
				setState(241); expr();
				}
				}
				break;
			case 6:
				_localctx = new ExplParentContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(242); match(PARENTESIS);
				setState(243); expr();
				setState(244); match(PARENTESIS2);
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
			list.add("expleft");
			exitRule();
		}
		return _localctx;
	}

	public static class Callout_argContext extends ParserRuleContext {
		public Callout_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callout_arg; }
	 
		public Callout_argContext() { }
		public void copyFrom(Callout_argContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CallArgContext extends Callout_argContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(DecafParser.STRING, 0); }
		public CallArgContext(Callout_argContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCallArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCallArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitCallArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Callout_argContext callout_arg() throws RecognitionException {
		Callout_argContext _localctx = new Callout_argContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callout_arg);
		try {
			_localctx = new CallArgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			switch (_input.LA(1)) {
			case SUB:
			case NO:
			case PARENTESIS:
			case ENTEROS:
			case HEX:
			case CHAR:
			case BOOLEANS:
			case ID:
				{
				setState(248); expr();
				}
				break;
			case STRING:
				{
				setState(249); match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			list.add("callout_arg");
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
		public Bin_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bin_op; }
	 
		public Bin_opContext() { }
		public void copyFrom(Bin_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BinOPContext extends Bin_opContext {
		public Arith_opContext arith_op() {
			return getRuleContext(Arith_opContext.class,0);
		}
		public Rel_opContext rel_op() {
			return getRuleContext(Rel_opContext.class,0);
		}
		public Eq_opContext eq_op() {
			return getRuleContext(Eq_opContext.class,0);
		}
		public Cond_opContext cond_op() {
			return getRuleContext(Cond_opContext.class,0);
		}
		public BinOPContext(Bin_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterBinOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitBinOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitBinOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bin_opContext bin_op() throws RecognitionException {
		Bin_opContext _localctx = new Bin_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_bin_op);
		try {
			_localctx = new BinOPContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			switch (_input.LA(1)) {
			case PLUS:
			case MULT:
			case DIV:
			case SUB:
			case PER:
				{
				setState(254); arith_op();
				}
				break;
			case MAY:
			case MEN:
			case MAEQ:
			case MEEQ:
				{
				setState(255); rel_op();
				}
				break;
			case EQQ:
			case NOEQ:
				{
				setState(256); eq_op();
				}
				break;
			case ANDD:
			case ORR:
				{
				setState(257); cond_op();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			list.add("bin_op");
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
		public Arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arith_op; }
	 
		public Arith_opContext() { }
		public void copyFrom(Arith_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArithOPContext extends Arith_opContext {
		public TerminalNode PER() { return getToken(DecafParser.PER, 0); }
		public TerminalNode MULT() { return getToken(DecafParser.MULT, 0); }
		public TerminalNode SUB() { return getToken(DecafParser.SUB, 0); }
		public TerminalNode PLUS() { return getToken(DecafParser.PLUS, 0); }
		public TerminalNode DIV() { return getToken(DecafParser.DIV, 0); }
		public ArithOPContext(Arith_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterArithOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitArithOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitArithOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arith_opContext arith_op() throws RecognitionException {
		Arith_opContext _localctx = new Arith_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arith_op);
		int _la;
		try {
			_localctx = new ArithOPContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MULT) | (1L << DIV) | (1L << SUB) | (1L << PER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			list.add("arith_op");
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
		public Rel_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rel_op; }
	 
		public Rel_opContext() { }
		public void copyFrom(Rel_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelOPContext extends Rel_opContext {
		public TerminalNode MEN() { return getToken(DecafParser.MEN, 0); }
		public TerminalNode MAEQ() { return getToken(DecafParser.MAEQ, 0); }
		public TerminalNode MAY() { return getToken(DecafParser.MAY, 0); }
		public TerminalNode MEEQ() { return getToken(DecafParser.MEEQ, 0); }
		public RelOPContext(Rel_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterRelOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitRelOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitRelOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rel_opContext rel_op() throws RecognitionException {
		Rel_opContext _localctx = new Rel_opContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_rel_op);
		int _la;
		try {
			_localctx = new RelOPContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MAY) | (1L << MEN) | (1L << MAEQ) | (1L << MEEQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			list.add("rel_op");
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
		public Eq_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eq_op; }
	 
		public Eq_opContext() { }
		public void copyFrom(Eq_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqOPContext extends Eq_opContext {
		public TerminalNode EQQ() { return getToken(DecafParser.EQQ, 0); }
		public TerminalNode NOEQ() { return getToken(DecafParser.NOEQ, 0); }
		public EqOPContext(Eq_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterEqOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitEqOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitEqOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Eq_opContext eq_op() throws RecognitionException {
		Eq_opContext _localctx = new Eq_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eq_op);
		int _la;
		try {
			_localctx = new EqOPContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !(_la==EQQ || _la==NOEQ) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			list.add("eq_op");
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
		public Cond_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_op; }
	 
		public Cond_opContext() { }
		public void copyFrom(Cond_opContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondOPContext extends Cond_opContext {
		public TerminalNode ANDD() { return getToken(DecafParser.ANDD, 0); }
		public TerminalNode ORR() { return getToken(DecafParser.ORR, 0); }
		public CondOPContext(Cond_opContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterCondOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitCondOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitCondOP(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_opContext cond_op() throws RecognitionException {
		Cond_opContext _localctx = new Cond_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cond_op);
		int _la;
		try {
			_localctx = new CondOPContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			_la = _input.LA(1);
			if ( !(_la==ANDD || _la==ORR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			list.add("cond_op");
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
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LitContext extends LiteralContext {
		public Int_literalContext int_literal() {
			return getRuleContext(Int_literalContext.class,0);
		}
		public TerminalNode BOOLEANS() { return getToken(DecafParser.BOOLEANS, 0); }
		public TerminalNode CHAR() { return getToken(DecafParser.CHAR, 0); }
		public LitContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		try {
			_localctx = new LitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			switch (_input.LA(1)) {
			case ENTEROS:
			case HEX:
				{
				setState(274); int_literal();
				}
				break;
			case CHAR:
				{
				setState(275); match(CHAR);
				}
				break;
			case BOOLEANS:
				{
				setState(276); match(BOOLEANS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			list.add("literal");
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
		public Int_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_int_literal; }
	 
		public Int_literalContext() { }
		public void copyFrom(Int_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntLitContext extends Int_literalContext {
		public TerminalNode HEX() { return getToken(DecafParser.HEX, 0); }
		public Decimal_literalContext decimal_literal() {
			return getRuleContext(Decimal_literalContext.class,0);
		}
		public IntLitContext(Int_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterIntLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitIntLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitIntLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Int_literalContext int_literal() throws RecognitionException {
		Int_literalContext _localctx = new Int_literalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_int_literal);
		try {
			_localctx = new IntLitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			switch (_input.LA(1)) {
			case ENTEROS:
				{
				setState(281); decimal_literal();
				}
				break;
			case HEX:
				{
				setState(282); match(HEX);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			list.add("int_literal");
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
		public Decimal_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal_literal; }
	 
		public Decimal_literalContext() { }
		public void copyFrom(Decimal_literalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecLitContext extends Decimal_literalContext {
		public List<TerminalNode> ENTEROS() { return getTokens(DecafParser.ENTEROS); }
		public TerminalNode ENTEROS(int i) {
			return getToken(DecafParser.ENTEROS, i);
		}
		public DecLitContext(Decimal_literalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).enterDecLit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DecafParserListener ) ((DecafParserListener)listener).exitDecLit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DecafParserVisitor ) return ((DecafParserVisitor<? extends T>)visitor).visitDecLit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decimal_literalContext decimal_literal() throws RecognitionException {
		Decimal_literalContext _localctx = new Decimal_literalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_decimal_literal);
		int _la;
		try {
			_localctx = new DecLitContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(287); match(ENTEROS);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENTEROS) {
				{
				{
				setState(288); match(ENTEROS);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			list.add("decimal_literal");
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3I\u012b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\3\7\3"+
		"\63\n\3\f\3\16\3\66\13\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\7\3?\n\3\f\3"+
		"\16\3B\13\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6P\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6W\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6_\n\6\f\6\16\6"+
		"b\13\6\5\6d\n\6\3\6\3\6\3\6\3\7\3\7\5\7k\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7u\n\7\f\7\16\7x\13\7\5\7z\n\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\7"+
		"\b\u0083\n\b\f\b\16\b\u0086\13\b\3\b\7\b\u0089\n\b\f\b\16\b\u008c\13\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00a0\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u00b4\n\t\3\t\3\t\3\t\5\t\u00b9\n\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\5\13\u00c2\n\13\3\13\3\13\3\13\5\13\u00c7\n\13\7"+
		"\13\u00c9\n\13\f\13\16\13\u00cc\13\13\5\13\u00ce\n\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d9\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ec\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f9\n\16\3\17\3\17\5\17\u00fd"+
		"\n\17\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u0105\n\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\5\25"+
		"\u0118\n\25\3\25\3\25\3\26\3\26\5\26\u011e\n\26\3\26\3\26\3\27\3\27\7"+
		"\27\u0124\n\27\f\27\16\27\u0127\13\27\3\27\3\27\3\27\2\2\30\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\b\3\2-.\4\2\37\37*+\4\2\31\34"+
		"  \3\2!$\3\2%&\3\2\'(\u0141\2.\3\2\2\2\4\64\3\2\2\2\6E\3\2\2\2\bH\3\2"+
		"\2\2\nO\3\2\2\2\fj\3\2\2\2\16\u0080\3\2\2\2\20\u00b8\3\2\2\2\22\u00ba"+
		"\3\2\2\2\24\u00bd\3\2\2\2\26\u00d8\3\2\2\2\30\u00eb\3\2\2\2\32\u00f8\3"+
		"\2\2\2\34\u00fc\3\2\2\2\36\u0104\3\2\2\2 \u0108\3\2\2\2\"\u010b\3\2\2"+
		"\2$\u010e\3\2\2\2&\u0111\3\2\2\2(\u0117\3\2\2\2*\u011d\3\2\2\2,\u0121"+
		"\3\2\2\2./\5\4\3\2/\60\b\2\1\2\60\3\3\2\2\2\61\63\5\b\5\2\62\61\3\2\2"+
		"\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65:\3\2\2\2\66\64\3\2\2\2"+
		"\679\5\n\6\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;@\3\2\2\2<:\3\2"+
		"\2\2=?\5\f\7\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2"+
		"\2\2CD\b\3\1\2D\5\3\2\2\2EF\t\2\2\2FG\b\4\1\2G\7\3\2\2\2HI\7\66\2\2IJ"+
		"\7H\2\2JK\7<\2\2KL\b\5\1\2L\t\3\2\2\2MP\5\6\4\2NP\7\65\2\2OM\3\2\2\2O"+
		"N\3\2\2\2PV\3\2\2\2QW\7H\2\2RS\7I\2\2ST\5*\26\2TU\7@\2\2UW\3\2\2\2VQ\3"+
		"\2\2\2VR\3\2\2\2Wc\3\2\2\2X`\7:\2\2Y_\7H\2\2Z[\7I\2\2[\\\5*\26\2\\]\7"+
		"@\2\2]_\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ad\3"+
		"\2\2\2b`\3\2\2\2cX\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7<\2\2fg\b\6\1\2g\13"+
		"\3\2\2\2hk\5\6\4\2ik\7\65\2\2jh\3\2\2\2ji\3\2\2\2kl\3\2\2\2lm\7H\2\2m"+
		"y\7A\2\2no\5\6\4\2ov\7H\2\2pq\7:\2\2qr\5\6\4\2rs\7H\2\2su\3\2\2\2tp\3"+
		"\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2yn\3\2\2\2yz\3"+
		"\2\2\2z{\3\2\2\2{|\7B\2\2|}\5\16\b\2}~\3\2\2\2~\177\b\7\1\2\177\r\3\2"+
		"\2\2\u0080\u0084\7=\2\2\u0081\u0083\5\n\6\2\u0082\u0081\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008a\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0087\u0089\5\20\t\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2"+
		"\2\2\u008c\u008a\3\2\2\2\u008d\u008e\7>\2\2\u008e\u008f\b\b\1\2\u008f"+
		"\17\3\2\2\2\u0090\u0091\5\26\f\2\u0091\u0092\5\22\n\2\u0092\u0093\5\30"+
		"\r\2\u0093\u0094\7<\2\2\u0094\u00b9\3\2\2\2\u0095\u0096\5\24\13\2\u0096"+
		"\u0097\7<\2\2\u0097\u00b9\3\2\2\2\u0098\u0099\7\60\2\2\u0099\u009a\7A"+
		"\2\2\u009a\u009b\5\30\r\2\u009b\u009c\7B\2\2\u009c\u009f\5\16\b\2\u009d"+
		"\u009e\78\2\2\u009e\u00a0\5\16\b\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00b9\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a3\7A\2\2\u00a3"+
		"\u00a4\7H\2\2\u00a4\u00a5\7\37\2\2\u00a5\u00a6\5\30\r\2\u00a6\u00a7\7"+
		":\2\2\u00a7\u00a8\5\30\r\2\u00a8\u00a9\7B\2\2\u00a9\u00aa\5\16\b\2\u00aa"+
		"\u00b9\3\2\2\2\u00ab\u00ac\7\62\2\2\u00ac\u00ad\7A\2\2\u00ad\u00ae\5\30"+
		"\r\2\u00ae\u00af\7B\2\2\u00af\u00b0\5\16\b\2\u00b0\u00b9\3\2\2\2\u00b1"+
		"\u00b3\7\63\2\2\u00b2\u00b4\5\30\r\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3"+
		"\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b9\7<\2\2\u00b6\u00b7\7\67\2\2\u00b7"+
		"\u00b9\7<\2\2\u00b8\u0090\3\2\2\2\u00b8\u0095\3\2\2\2\u00b8\u0098\3\2"+
		"\2\2\u00b8\u00a1\3\2\2\2\u00b8\u00ab\3\2\2\2\u00b8\u00b1\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\21\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb\u00bc\b\n\1"+
		"\2\u00bc\23\3\2\2\2\u00bd\u00be\7H\2\2\u00be\u00cd\7A\2\2\u00bf\u00c2"+
		"\5\30\r\2\u00c0\u00c2\7\16\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2"+
		"\u00c2\u00ca\3\2\2\2\u00c3\u00c6\7:\2\2\u00c4\u00c7\5\30\r\2\u00c5\u00c7"+
		"\7\16\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00c9\3\2\2\2"+
		"\u00c8\u00c3\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00c1\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\7B\2\2\u00d0\u00d1\b\13"+
		"\1\2\u00d1\25\3\2\2\2\u00d2\u00d9\7H\2\2\u00d3\u00d4\7H\2\2\u00d4\u00d5"+
		"\7?\2\2\u00d5\u00d6\5\30\r\2\u00d6\u00d7\7@\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u00d2\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\b\f"+
		"\1\2\u00db\27\3\2\2\2\u00dc\u00ec\5\26\f\2\u00dd\u00ec\5\24\13\2\u00de"+
		"\u00ec\5(\25\2\u00df\u00e0\5\32\16\2\u00e0\u00e1\5\36\20\2\u00e1\u00e2"+
		"\5\30\r\2\u00e2\u00ec\3\2\2\2\u00e3\u00e4\7\34\2\2\u00e4\u00ec\5\30\r"+
		"\2\u00e5\u00e6\7,\2\2\u00e6\u00ec\5\30\r\2\u00e7\u00e8\7A\2\2\u00e8\u00e9"+
		"\5\30\r\2\u00e9\u00ea\7B\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00dc\3\2\2\2\u00eb"+
		"\u00dd\3\2\2\2\u00eb\u00de\3\2\2\2\u00eb\u00df\3\2\2\2\u00eb\u00e3\3\2"+
		"\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e7\3\2\2\2\u00ec\31\3\2\2\2\u00ed\u00f9"+
		"\5\26\f\2\u00ee\u00f9\5\24\13\2\u00ef\u00f9\5(\25\2\u00f0\u00f1\7\34\2"+
		"\2\u00f1\u00f9\5\30\r\2\u00f2\u00f3\7,\2\2\u00f3\u00f9\5\30\r\2\u00f4"+
		"\u00f5\7A\2\2\u00f5\u00f6\5\30\r\2\u00f6\u00f7\7B\2\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00ed\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f8\u00ef\3\2\2\2\u00f8"+
		"\u00f0\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f9\33\3\2\2"+
		"\2\u00fa\u00fd\5\30\r\2\u00fb\u00fd\7\16\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b\17\1\2\u00ff\35\3\2\2"+
		"\2\u0100\u0105\5 \21\2\u0101\u0105\5\"\22\2\u0102\u0105\5$\23\2\u0103"+
		"\u0105\5&\24\2\u0104\u0100\3\2\2\2\u0104\u0101\3\2\2\2\u0104\u0102\3\2"+
		"\2\2\u0104\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\b\20\1\2\u0107"+
		"\37\3\2\2\2\u0108\u0109\t\4\2\2\u0109\u010a\b\21\1\2\u010a!\3\2\2\2\u010b"+
		"\u010c\t\5\2\2\u010c\u010d\b\22\1\2\u010d#\3\2\2\2\u010e\u010f\t\6\2\2"+
		"\u010f\u0110\b\23\1\2\u0110%\3\2\2\2\u0111\u0112\t\7\2\2\u0112\u0113\b"+
		"\24\1\2\u0113\'\3\2\2\2\u0114\u0118\5*\26\2\u0115\u0118\7F\2\2\u0116\u0118"+
		"\7G\2\2\u0117\u0114\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0116\3\2\2\2\u0118"+
		"\u0119\3\2\2\2\u0119\u011a\b\25\1\2\u011a)\3\2\2\2\u011b\u011e\5,\27\2"+
		"\u011c\u011e\7E\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u011f"+
		"\3\2\2\2\u011f\u0120\b\26\1\2\u0120+\3\2\2\2\u0121\u0125\7C\2\2\u0122"+
		"\u0124\7C\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2"+
		"\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2\2\2\u0127\u0125\3\2\2\2\u0128"+
		"\u0129\b\27\1\2\u0129-\3\2\2\2\36\64:@OV^`cjvy\u0084\u008a\u009f\u00b3"+
		"\u00b8\u00c1\u00c6\u00ca\u00cd\u00d8\u00eb\u00f8\u00fc\u0104\u0117\u011d"+
		"\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}