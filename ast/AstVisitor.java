package compiler.ast;

import java.util.*;
import java.util.LinkedList;
import org.antlr.v4.runtime.tree.TerminalNode;
import compiler.parser.DecafParser;
import compiler.parser.DecafParserBaseVisitor;


public class AstVisitor extends DecafParserBaseVisitor<Node>{
	
	@Override
	public Node visitProg(DecafParser.ProgContext ctx){
		Root root = new Root();	

		List<DecafParser.Field_declContext> listd = ctx.field_decl();
		for(DecafParser.Field_declContext e : listd){
			root.add(visit(e));		
		}

		List<DecafParser.Method_declContext> listm = ctx.method_decl();
		for(DecafParser.Method_declContext e : listm){
			root.add(visit(e));			
		}
		
		List<DecafParser.Callout_declContext> listc = ctx.callout_decl();
		for(DecafParser.Callout_declContext e : listc){
			root.add(visit(e));			
		}

		return root;
	}

	@Override
	public Node visitCalloutDec(DecafParser.CalloutDecContext ctx){		
		return new Callout(ctx.ID().getText());
	}

	@Override
	public Node visitTipo(DecafParser.TipoContext ctx){
		TerminalNode type = ctx.BOO() == null ? ctx.INT() : ctx.BOO();
		return new Type(type.getText());
	}

	@Override
	public Node visitAssingOP(DecafParser.AssingOPContext ctx){
		TerminalNode assingOP = ctx.PLEQ() == null ? (ctx.MIEQ() == null ? ctx.EQ() : ctx.MIEQ()) : ctx.PLEQ();
		return new AssingOP(assingOP.getText());
	}

	@Override
	public Node visitLocacion(DecafParser.LocacionContext ctx){
		if (ctx.expr() != null){
			return new Location(ctx.ID().getText(),visit(ctx.expr()));
		}else {
			return new Location(ctx.ID().getText());
		}
	}

	@Override
	public Node visitBloque(DecafParser.BloqueContext ctx){
		LinkedList<Node> list1 = new LinkedList<Node>();
		LinkedList<Node> list2 = new LinkedList<Node>();
		for(DecafParser.Field_declContext e : ctx.field_decl()) 
			list1.add(visit(e));
		for(DecafParser.StatementContext e : ctx.statement()) 
			list2.add(visit(e));
		return new Block(list1,list2);
	}

	@Override
	public Node visitAsigna(DecafParser.AsignaContext ctx){
		return new Sasignacion(visit(ctx.location()),visit(ctx.assign_op()),visit(ctx.expr()));
	}

	@Override
	public Node visitMetodo(DecafParser.MetodoContext ctx){
		return new SMethodCall(visit(ctx.method_call()));
	}	

	@Override
	public Node visitSif(DecafParser.SifContext ctx){
		if(ctx.ELSE() == null){
			return new Sif(visit(ctx.expr()),visit(ctx.block(0)));
		}else{
			return new Sif(visit(ctx.expr()),visit(ctx.block(0)),visit(ctx.block(1)));
		}
	}	

	@Override
	public Node visitSfor(DecafParser.SforContext ctx){
		String id = ctx.ID().getText();
		return new Sfor(id,visit(ctx.expr(0)),visit(ctx.expr(1)),visit(ctx.block()));
	}

	@Override
	public Node visitSwhile(DecafParser.SwhileContext ctx){
		return new SWhile(visit(ctx.expr()),visit(ctx.block()));
	}	

	@Override
	public Node visitSreturn(DecafParser.SreturnContext ctx){
		if(ctx.expr()== null){
			return new Sreturn(visit(ctx.expr()));
		}else{
			return new Sreturn(null);
		}
	}		

	@Override
	public Node visitScontinue(DecafParser.ScontinueContext ctx){
		return new Scontinue();
	}

	@Override
	public Node visitMethodCall(DecafParser.MethodCallContext ctx){
		String id = ctx.ID().getText();
		LinkedList<String> list1 = new LinkedList<String>();
		LinkedList<Node> list2 = new LinkedList<Node>();
		for(TerminalNode e : ctx.STRING()) 
			list1.add(e.getText());
		for(DecafParser.ExprContext e : ctx.expr()) 
			list2.add(visit(e));
		return new MethodCall(id,list1,list2);
	}

	@Override
	public Node visitCallArg(DecafParser.CallArgContext ctx){
		if (ctx.STRING() == null){
			return new CallArg(null,visit(ctx.expr()));
		}else{
			return new CallArg(ctx.STRING().getText(),null);
		}
	}

	@Override
	public Node visitBinOP(DecafParser.BinOPContext ctx){
		if (ctx.arith_op()!=null){
			return new BinOP(visit(ctx.arith_op()),null,null,null);
		}else if (ctx.rel_op()!=null){
			return new BinOP(null,visit(ctx.rel_op()),null,null);
		}else if (ctx.eq_op()!=null){
			return new BinOP(null,null,visit(ctx.eq_op()),null);
		}else{
			return new BinOP(null,null,null,visit(ctx.cond_op()));
		}
	}

	@Override
	public Node visitArithOP(DecafParser.ArithOPContext ctx){
		if(ctx.PER()!=null){
			return new Operadores(ctx.PER().getText());
		}else if(ctx.MULT()!=null){
			return new Operadores(ctx.MULT().getText());
		}else if(ctx.SUB()!=null){
			return new Operadores(ctx.SUB().getText());
		}else if(ctx.PLUS()!=null){
			return new Operadores(ctx.PLUS().getText());
		}else{
			return new Operadores(ctx.DIV().getText());
		}
	}

	@Override
	public Node visitRelOP(DecafParser.RelOPContext ctx){
		if(ctx.MEN()!=null){
			return new Operadores(ctx.MEN().getText());
		}else if(ctx.MAEQ()!=null){
			return new Operadores(ctx.MAEQ().getText());
		}else if(ctx.MAY()!=null){
			return new Operadores(ctx.MAY().getText());
		}else{
			return new Operadores(ctx.MEEQ().getText());
		}
	}

	@Override
	public Node visitEqOP(DecafParser.EqOPContext ctx){
		if(ctx.EQQ()!=null){
			return new Operadores(ctx.EQQ().getText());
		}else{
			return new Operadores(ctx.NOEQ().getText());
		}
	}

	@Override
	public Node visitCondOP(DecafParser.CondOPContext ctx){
		if(ctx.ANDD()!=null){
			return new Operadores(ctx.ANDD().getText());
		}else{
			return new Operadores(ctx.ORR().getText());
		}
	}

	@Override
	public Node visitLit(DecafParser.LitContext ctx){
		if(ctx.int_literal()!=null){
			return new Literal(null,visit(ctx.int_literal()));
		}else if(ctx.BOOLEANS()!=null){
			return new Literal(ctx.BOOLEANS().getText(),null);
		}else{
			return new Literal(ctx.CHAR().getText(),null);
		}
	}
	@Override
	public Node visitIntLit(DecafParser.IntLitContext ctx){
		if(ctx.decimal_literal()!=null){
			return new Literal(null,visit(ctx.decimal_literal()));
		}else{
			return new Literal(ctx.HEX().getText(),null);
		}
	}
	@Override
	public Node visitDecLit(DecafParser.DecLitContext ctx){
		LinkedList<String> s = new LinkedList<String>();
		for(TerminalNode n : ctx.ENTEROS()) 
			s.add(n.getText());
		return new DecLit(s);
	}
	@Override
	public Node visitExpLoc(DecafParser.ExpLocContext ctx){
		return new Exprecion(visit(ctx.location()));
	}	
	@Override
	public Node visitExplLoc(DecafParser.ExplLocContext ctx){
		return new Exprecion(visit(ctx.location()));
	}	
	@Override
	public Node visitExpMeth(DecafParser.ExpMethContext ctx){
		return new Exprecion(visit(ctx.method_call()));
	}
	@Override
	public Node visitExplMeth(DecafParser.ExplMethContext ctx){
		return new Exprecion(visit(ctx.method_call()));
	}
	@Override
	public Node visitExpLit(DecafParser.ExpLitContext ctx){
		return new Exprecion(visit(ctx.literal()));
	}
	@Override
	public Node visitExpOP(DecafParser.ExpOPContext ctx){
		return new EBinOP(visit(ctx.bin_op()),visit(ctx.expr()),visit(ctx.expleft()));
	}
	@Override
	public Node visitExpSub(DecafParser.ExpSubContext ctx){
		return new ExpS(visit(ctx.expr()),"-");
	}
	@Override
	public Node visitExplSub(DecafParser.ExplSubContext ctx){
		return new ExpS(visit(ctx.expr()),"-");
	}
	@Override
	public Node visitExpNo(DecafParser.ExpNoContext ctx){
		return new ExpS(visit(ctx.expr()),"!");
	}
	@Override
	public Node visitExplNo(DecafParser.ExplNoContext ctx){
		return new ExpS(visit(ctx.expr()),"!");
	}
	@Override
	public Node visitExpParent(DecafParser.ExpParentContext ctx){
		return new ExpS(visit(ctx.expr()),"(");
	}
	@Override
	public Node visitFieldDec(DecafParser.FieldDecContext ctx){
		if(ctx.type()!=null){
			LinkedList<String> id = new LinkedList<String>();
			for(TerminalNode e : ctx.ID()) 
				id.add(e.getText());
			LinkedList<String> idb = new LinkedList<String>();
			for(TerminalNode e : ctx.IDB()) 
				idb.add(e.getText());
			LinkedList<Node> lit = new LinkedList<Node>();
			for(DecafParser.Int_literalContext e : ctx.int_literal()) 
				lit.add(visit(e));

			return new FieldDec(visit(ctx.type()),id,idb,lit);
		}else{
			LinkedList<String> id = new LinkedList<String>();
			for(TerminalNode e : ctx.ID()) 
				id.add(e.getText());
			LinkedList<String> idb = new LinkedList<String>();
			for(TerminalNode e : ctx.IDB()) 
				idb.add(e.getText());
			LinkedList<Node> lit = new LinkedList<Node>();
			for(DecafParser.Int_literalContext e : ctx.int_literal()) 
				lit.add(visit(e));

			return new FieldDec(ctx.VOID().getText(),id,idb,lit);
		}
	}
	@Override
	public Node visitMethodDec(DecafParser.MethodDecContext ctx){
		if(ctx.VOID()==null){
			LinkedList<String> id = new LinkedList<String>();
			for(TerminalNode e : ctx.ID()) 
				id.add(e.getText());
			LinkedList<Node> type = new LinkedList<Node>();
			for(DecafParser.TypeContext e : ctx.type()) 
				type.add(visit(e));
			return new MethodDec(type,id,visit(ctx.block()),true);
		}else{
			LinkedList<String> id = new LinkedList<String>();
			for(TerminalNode e : ctx.ID()) 
				id.add(e.getText());
			LinkedList<Node> type = new LinkedList<Node>();
			for(DecafParser.TypeContext e : ctx.type()) 
				type.add(visit(e));
			return new MethodDec(type,id,visit(ctx.block()),false);
		}
	}
}
