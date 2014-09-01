// Generated from parser/DecafParser.g by ANTLR 4.4

  package compiler.parser;
  import compiler.lib.Printer;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocation(@NotNull DecafParser.LocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocation(@NotNull DecafParser.LocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull DecafParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull DecafParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(@NotNull DecafParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(@NotNull DecafParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(@NotNull DecafParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(@NotNull DecafParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull DecafParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull DecafParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal_literal(@NotNull DecafParser.Decimal_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal_literal(@NotNull DecafParser.Decimal_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRel_op(@NotNull DecafParser.Rel_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRel_op(@NotNull DecafParser.Rel_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull DecafParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull DecafParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#callout_decl}.
	 * @param ctx the parse tree
	 */
	void enterCallout_decl(@NotNull DecafParser.Callout_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#callout_decl}.
	 * @param ctx the parse tree
	 */
	void exitCallout_decl(@NotNull DecafParser.Callout_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void enterBool_literal(@NotNull DecafParser.Bool_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#bool_literal}.
	 * @param ctx the parse tree
	 */
	void exitBool_literal(@NotNull DecafParser.Bool_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallout_arg(@NotNull DecafParser.Callout_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallout_arg(@NotNull DecafParser.Callout_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#alpha}.
	 * @param ctx the parse tree
	 */
	void enterAlpha(@NotNull DecafParser.AlphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#alpha}.
	 * @param ctx the parse tree
	 */
	void exitAlpha(@NotNull DecafParser.AlphaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(@NotNull DecafParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(@NotNull DecafParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCond_op(@NotNull DecafParser.Cond_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCond_op(@NotNull DecafParser.Cond_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(@NotNull DecafParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(@NotNull DecafParser.Int_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(@NotNull DecafParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(@NotNull DecafParser.Method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void enterChar_literal(@NotNull DecafParser.Char_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#char_literal}.
	 * @param ctx the parse tree
	 */
	void exitChar_literal(@NotNull DecafParser.Char_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#digit}.
	 * @param ctx the parse tree
	 */
	void enterDigit(@NotNull DecafParser.DigitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#digit}.
	 * @param ctx the parse tree
	 */
	void exitDigit(@NotNull DecafParser.DigitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull DecafParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull DecafParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArith_op(@NotNull DecafParser.Arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArith_op(@NotNull DecafParser.Arith_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull DecafParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull DecafParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void enterExpleft(@NotNull DecafParser.ExpleftContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void exitExpleft(@NotNull DecafParser.ExpleftContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull DecafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull DecafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEq_op(@NotNull DecafParser.Eq_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEq_op(@NotNull DecafParser.Eq_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(@NotNull DecafParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(@NotNull DecafParser.Field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#hex_literal}.
	 * @param ctx the parse tree
	 */
	void enterHex_literal(@NotNull DecafParser.Hex_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#hex_literal}.
	 * @param ctx the parse tree
	 */
	void exitHex_literal(@NotNull DecafParser.Hex_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#alpha_num}.
	 * @param ctx the parse tree
	 */
	void enterAlpha_num(@NotNull DecafParser.Alpha_numContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#alpha_num}.
	 * @param ctx the parse tree
	 */
	void exitAlpha_num(@NotNull DecafParser.Alpha_numContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(@NotNull DecafParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(@NotNull DecafParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#hex_digit}.
	 * @param ctx the parse tree
	 */
	void enterHex_digit(@NotNull DecafParser.Hex_digitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#hex_digit}.
	 * @param ctx the parse tree
	 */
	void exitHex_digit(@NotNull DecafParser.Hex_digitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssign_op(@NotNull DecafParser.Assign_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssign_op(@NotNull DecafParser.Assign_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(@NotNull DecafParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(@NotNull DecafParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull DecafParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull DecafParser.LiteralContext ctx);
}