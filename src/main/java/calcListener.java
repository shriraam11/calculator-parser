// Generated from /Users/shriraamreddyb/IdeaProjects/parseeg/src/main/java/calc.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calcParser}.
 */
public interface calcListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(calcParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(calcParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(calcParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link calcParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(calcParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegative(calcParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegative(calcParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(calcParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(calcParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBool(calcParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBool(calcParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddsub(calcParser.AddsubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addsub}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddsub(calcParser.AddsubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code power}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(calcParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code power}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(calcParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(calcParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(calcParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(calcParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(calcParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMuldiv(calcParser.MuldivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code muldiv}
	 * labeled alternative in {@link calcParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMuldiv(calcParser.MuldivContext ctx);
}