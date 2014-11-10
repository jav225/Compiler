// Generated from parser\DecafParser.g by ANTLR 4.4

  package compiler.parser;
  import java.util.*;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DecafParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DecafParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code tipo}
	 * labeled alternative in {@link DecafParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(@NotNull DecafParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sfor}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSfor(@NotNull DecafParser.SforContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldDec}
	 * labeled alternative in {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDec(@NotNull DecafParser.FieldDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asigna}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsigna(@NotNull DecafParser.AsignaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expLoc}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLoc(@NotNull DecafParser.ExpLocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expSub}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpSub(@NotNull DecafParser.ExpSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relOP}
	 * labeled alternative in {@link DecafParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelOP(@NotNull DecafParser.RelOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sif}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSif(@NotNull DecafParser.SifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expLit}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpLit(@NotNull DecafParser.ExpLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assingOP}
	 * labeled alternative in {@link DecafParser#assign_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingOP(@NotNull DecafParser.AssingOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lit}
	 * labeled alternative in {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(@NotNull DecafParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decLit}
	 * labeled alternative in {@link DecafParser#decimal_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecLit(@NotNull DecafParser.DecLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLit}
	 * labeled alternative in {@link DecafParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLit(@NotNull DecafParser.IntLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sreturn}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSreturn(@NotNull DecafParser.SreturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code metodo}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(@NotNull DecafParser.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bloque}
	 * labeled alternative in {@link DecafParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(@NotNull DecafParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explLit}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplLit(@NotNull DecafParser.ExplLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expMeth}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpMeth(@NotNull DecafParser.ExpMethContext ctx);
	/**
	 * Visit a parse tree produced by the {@code locacion}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocacion(@NotNull DecafParser.LocacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqOP}
	 * labeled alternative in {@link DecafParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqOP(@NotNull DecafParser.EqOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code swhile}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwhile(@NotNull DecafParser.SwhileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explLoc}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplLoc(@NotNull DecafParser.ExplLocContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explSub}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplSub(@NotNull DecafParser.ExplSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull DecafParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callArg}
	 * labeled alternative in {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArg(@NotNull DecafParser.CallArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explMeth}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplMeth(@NotNull DecafParser.ExplMethContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prog}
	 * labeled alternative in {@link DecafParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull DecafParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodDec}
	 * labeled alternative in {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDec(@NotNull DecafParser.MethodDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithOP}
	 * labeled alternative in {@link DecafParser#arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithOP(@NotNull DecafParser.ArithOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expParent}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParent(@NotNull DecafParser.ExpParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scontinue}
	 * labeled alternative in {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScontinue(@NotNull DecafParser.ScontinueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code calloutDec}
	 * labeled alternative in {@link DecafParser#callout_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalloutDec(@NotNull DecafParser.CalloutDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expOP}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpOP(@NotNull DecafParser.ExpOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expNo}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNo(@NotNull DecafParser.ExpNoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explNo}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplNo(@NotNull DecafParser.ExplNoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explParent}
	 * labeled alternative in {@link DecafParser#expleft}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplParent(@NotNull DecafParser.ExplParentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condOP}
	 * labeled alternative in {@link DecafParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondOP(@NotNull DecafParser.CondOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binOP}
	 * labeled alternative in {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOP(@NotNull DecafParser.BinOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCall}
	 * labeled alternative in {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(@NotNull DecafParser.MethodCallContext ctx);
}