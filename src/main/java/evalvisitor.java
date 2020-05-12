
import java.lang.Math;

public class evalvisitor extends calcBaseVisitor<Double> {

    @Override
    public Double visitPrintExpr(calcParser.PrintExprContext ctx) {
        Double value = visit(ctx.expr()); // evaluate the expr child
        System.out.println(value); // print the result
        return value; // return dummy value
    }
    /** INT */
    @Override
    public Double visitInt(calcParser.IntContext ctx)
    {
        return (double)Integer.valueOf(ctx.INT().getText());
    }
    /** ID */
    @Override
    public Double visitPower(calcParser.PowerContext ctx) {
        double left = (double)visit(ctx.expr(0)); // get value of left subexpression
        double right = (double)visit(ctx.expr(1)); // get value of right subexpression
        return Math.pow(left,right);
    }
    /** expr op=('*'|'/') expr */
    @Override
    public Double visitMuldiv(calcParser.MuldivContext ctx) {
        double left = visit(ctx.expr(0)); // get value of left subexpression
        double right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == calcParser.MUL ) return left * right;
        return left / right; // must be DIV
    }
    /** expr op=('+'|'-') expr */
    @Override
    public Double visitAddsub(calcParser.AddsubContext ctx) {
        double left = visit(ctx.expr(0)); // get value of left subexpression
        double right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == calcParser.ADD ) return left + right;
        return left - right; // must be SUB
    }
    @Override public Double visitFloat(calcParser.FloatContext ctx) {
        return (double)Float.parseFloat(ctx.FLOAT().getText());
    }

    /** '(' expr ')' */
    @Override
    public Double visitParens(calcParser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }
    /** '-' expr */
    @Override public Double visitNegative(calcParser.NegativeContext ctx) {
        return -1*visit(ctx.expr());
    }
}



