
import java.lang.Math;

public class evalvisitor extends calcBaseVisitor<Integer> {

    @Override
    public Integer visitPrintExpr(calcParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr()); // evaluate the expr child
        System.out.println(value); // print the result
        return 0; // return dummy value
    }
    /** INT */
    @Override
    public Integer visitInt(calcParser.IntContext ctx)
    {
        return Integer.valueOf(ctx.INT().getText());
    }
    /** ID */
    @Override
    public Integer visitPower(calcParser.PowerContext ctx) {
        double left = (double)visit(ctx.expr(0)); // get value of left subexpression
        double right = (double)visit(ctx.expr(1)); // get value of right subexpression
        return (int)Math.pow(left,right);
    }
    /** expr op=('*'|'/') expr */
    @Override
    public Integer visitMuldiv(calcParser.MuldivContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == calcParser.MUL ) return left * right;
        return left / right; // must be DIV
    }
    /** expr op=('+'|'-') expr */
    @Override
    public Integer visitAddsub(calcParser.AddsubContext ctx) {
        int left = visit(ctx.expr(0)); // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == calcParser.ADD ) return left + right;
        return left - right; // must be SUB
    }
    /** '(' expr ')' */
    @Override
    public Integer visitParens(calcParser.ParensContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }
}



