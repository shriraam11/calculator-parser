

public class ConvertTree extends calcBaseVisitor<ExpressionNode> {
    @Override
    public ExpressionNode visitPrintExpr(calcParser.PrintExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public ExpressionNode visitAddsub(calcParser.AddsubContext ctx) {
        ExpressionNode node;
        ExpressionNode left = visit(ctx.expr(0)); // get value of left subexpression
        ExpressionNode right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == calcParser.ADD) return node = new AddNode(left, right);
        return node = new SubNode(left, right); // must be SUB
    }
    @Override
    public ExpressionNode visitPower(calcParser.PowerContext ctx) {
        ExpressionNode node;
        ExpressionNode left = visit(ctx.expr(0)); // get value of left subexpression
        ExpressionNode right = visit(ctx.expr(1)); // get value of right subexpression
        return node=new PowNode(left,right);
    }
    @Override
    public ExpressionNode visitInt(calcParser.IntContext ctx) {
        ExpressionNode node;
       node = new IntegerNode(Integer.valueOf(ctx.INT().getText()));
       return node;
    }
    @Override
    public ExpressionNode visitMuldiv(calcParser.MuldivContext ctx) {
        ExpressionNode node;
        ExpressionNode left = visit(ctx.expr(0)); // get value of left subexpression
        ExpressionNode right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == calcParser.MUL) return node = new MulNode(left, right);
        return node = new DivNode(left, right); // must be SUB
    }
    @Override public ExpressionNode visitParens(calcParser.ParensContext ctx) {
        return visit(ctx.expr());

    }
}
