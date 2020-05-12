

public class ConvertTree extends calcBaseVisitor<ExpressionNode> {
    @Override
    public ExpressionNode visitPrintExpr(calcParser.PrintExprContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public ExpressionNode visitAddsub(calcParser.AddsubContext ctx) {
        //ExpressionNode = node;
        ExpressionNode left = visit(ctx.expr(0)); // get value of left subexpression
        ExpressionNode right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == calcParser.ADD) return  new AddNode(left, right);
        return  new SubNode(left, right);
         // must be SUB
    }
    @Override
    public ExpressionNode visitPower(calcParser.PowerContext ctx) {
       // ExpressionNode node;
        ExpressionNode left = visit(ctx.expr(0)); // get value of left subexpression
        ExpressionNode right = visit(ctx.expr(1)); // get value of right subexpression
        return new PowNode(left,right);
    }
    @Override
    public ExpressionNode visitInt(calcParser.IntContext ctx) {
        ExpressionNode node;
       node = new IntegerNode(Integer.valueOf(ctx.INT().getText()));
       return node;
    }
    @Override
    public ExpressionNode visitMuldiv(calcParser.MuldivContext ctx) {
       // ExpressionNode node;
        ExpressionNode left = visit(ctx.expr(0)); // get value of left subexpression
        ExpressionNode right = visit(ctx.expr(1)); // get value of right subexpression
        if (ctx.op.getType() == calcParser.MUL) return  new MulNode(left, right);
        return  new DivNode(left, right); // must be SUB
    }
    @Override
    public ExpressionNode visitParens(calcParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
    @Override
    public ExpressionNode visitFloat(calcParser.FloatContext ctx) {
        ExpressionNode node;
        node = new FloatNode(Float.valueOf(ctx.FLOAT().getText()));
        return node;
    }
    @Override
    public ExpressionNode visitNegative(calcParser.NegativeContext ctx) {
        //ExpressionNode node;
        ExpressionNode left = new IntegerNode(0); // get value of left subexpression
        ExpressionNode right = visit(ctx.expr()); // get value of right subexpression
        return new SubNode(left,right);
    }
}
