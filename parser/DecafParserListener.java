// Generated from parser\DecafParser.g by ANTLR 4.4

  package compiler.parser;
  import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code tipo}
	 * labeled alternative in {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void enterTipo(@NotNull DecafParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tipo}
	 * labeled alternative in {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void exitTipo(@NotNull DecafParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sfor}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSfor(@NotNull DecafParser.SforContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sfor}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSfor(@NotNull DecafParser.SforContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldDec}
	 * labeled alternative in {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterFieldDec(@NotNull DecafParser.FieldDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldDec}
	 * labeled alternative in {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitFieldDec(@NotNull DecafParser.FieldDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asigna}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAsigna(@NotNull DecafParser.AsignaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asigna}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAsigna(@NotNull DecafParser.AsignaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expLoc}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpLoc(@NotNull DecafParser.ExpLocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expLoc}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpLoc(@NotNull DecafParser.ExpLocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expSub}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpSub(@NotNull DecafParser.ExpSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expSub}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpSub(@NotNull DecafParser.ExpSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relOP}
	 * labeled alternative in {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void enterRelOP(@NotNull DecafParser.RelOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relOP}
	 * labeled alternative in {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 */
	void exitRelOP(@NotNull DecafParser.RelOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sif}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSif(@NotNull DecafParser.SifContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sif}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSif(@NotNull DecafParser.SifContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expLit}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpLit(@NotNull DecafParser.ExpLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expLit}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpLit(@NotNull DecafParser.ExpLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assingOP}
	 * labeled alternative in {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void enterAssingOP(@NotNull DecafParser.AssingOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assingOP}
	 * labeled alternative in {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 */
	void exitAssingOP(@NotNull DecafParser.AssingOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lit}
	 * labeled alternative in {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLit(@NotNull DecafParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lit}
	 * labeled alternative in {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLit(@NotNull DecafParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decLit}
	 * labeled alternative in {@link DecafParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void enterDecLit(@NotNull DecafParser.DecLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decLit}
	 * labeled alternative in {@link DecafParser#decimal_literal}.
	 * @param ctx the parse tree
	 */
	void exitDecLit(@NotNull DecafParser.DecLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intLit}
	 * labeled alternative in {@link DecafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterIntLit(@NotNull DecafParser.IntLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intLit}
	 * labeled alternative in {@link DecafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitIntLit(@NotNull DecafParser.IntLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sreturn}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSreturn(@NotNull DecafParser.SreturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sreturn}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSreturn(@NotNull DecafParser.SreturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code metodo}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(@NotNull DecafParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code metodo}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(@NotNull DecafParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bloque}
	 * labeled alternative in {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBloque(@NotNull DecafParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bloque}
	 * labeled alternative in {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBloque(@NotNull DecafParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explLit}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void enterExplLit(@NotNull DecafParser.ExplLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explLit}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void exitExplLit(@NotNull DecafParser.ExplLitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expMeth}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpMeth(@NotNull DecafParser.ExpMethContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expMeth}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpMeth(@NotNull DecafParser.ExpMethContext ctx);
	/**
	 * Enter a parse tree produced by the {@code locacion}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterLocacion(@NotNull DecafParser.LocacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code locacion}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitLocacion(@NotNull DecafParser.LocacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqOP}
	 * labeled alternative in {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void enterEqOP(@NotNull DecafParser.EqOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqOP}
	 * labeled alternative in {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 */
	void exitEqOP(@NotNull DecafParser.EqOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code swhile}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwhile(@NotNull DecafParser.SwhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code swhile}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwhile(@NotNull DecafParser.SwhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explLoc}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void enterExplLoc(@NotNull DecafParser.ExplLocContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explLoc}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void exitExplLoc(@NotNull DecafParser.ExplLocContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explSub}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void enterExplSub(@NotNull DecafParser.ExplSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explSub}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void exitExplSub(@NotNull DecafParser.ExplSubContext ctx);
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
	 * Enter a parse tree produced by the {@code callArg}
	 * labeled alternative in {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallArg(@NotNull DecafParser.CallArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callArg}
	 * labeled alternative in {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallArg(@NotNull DecafParser.CallArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explMeth}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void enterExplMeth(@NotNull DecafParser.ExplMethContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explMeth}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void exitExplMeth(@NotNull DecafParser.ExplMethContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prog}
	 * labeled alternative in {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProg(@NotNull DecafParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prog}
	 * labeled alternative in {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProg(@NotNull DecafParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodDec}
	 * labeled alternative in {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethodDec(@NotNull DecafParser.MethodDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodDec}
	 * labeled alternative in {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethodDec(@NotNull DecafParser.MethodDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithOP}
	 * labeled alternative in {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void enterArithOP(@NotNull DecafParser.ArithOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithOP}
	 * labeled alternative in {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 */
	void exitArithOP(@NotNull DecafParser.ArithOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expParent}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpParent(@NotNull DecafParser.ExpParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expParent}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpParent(@NotNull DecafParser.ExpParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scontinue}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterScontinue(@NotNull DecafParser.ScontinueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scontinue}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitScontinue(@NotNull DecafParser.ScontinueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code calloutDec}
	 * labeled alternative in {@link DecafParser#callout_decl}.
	 * @param ctx the parse tree
	 */
	void enterCalloutDec(@NotNull DecafParser.CalloutDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code calloutDec}
	 * labeled alternative in {@link DecafParser#callout_decl}.
	 * @param ctx the parse tree
	 */
	void exitCalloutDec(@NotNull DecafParser.CalloutDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expOP}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpOP(@NotNull DecafParser.ExpOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expOP}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpOP(@NotNull DecafParser.ExpOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expNo}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpNo(@NotNull DecafParser.ExpNoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expNo}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpNo(@NotNull DecafParser.ExpNoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explNo}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void enterExplNo(@NotNull DecafParser.ExplNoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explNo}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void exitExplNo(@NotNull DecafParser.ExplNoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explParent}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void enterExplParent(@NotNull DecafParser.ExplParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explParent}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 */
	void exitExplParent(@NotNull DecafParser.ExplParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condOP}
	 * labeled alternative in {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void enterCondOP(@NotNull DecafParser.CondOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condOP}
	 * labeled alternative in {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 */
	void exitCondOP(@NotNull DecafParser.CondOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binOP}
	 * labeled alternative in {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBinOP(@NotNull DecafParser.BinOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binOP}
	 * labeled alternative in {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBinOP(@NotNull DecafParser.BinOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(@NotNull DecafParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(@NotNull DecafParser.MethodCallContext ctx);
}