import java.lang.Math;
public interface    ExpressionNode {
    public double evaluate();
}

class   IntegerNode implements ExpressionNode {
    private  Integer value;
    public IntegerNode(Integer value) {
        this.value = value;
    }
    @Override public double evaluate()
    { return this.value;
    }
}
class FloatNode implements  ExpressionNode{
    private Float value;
    public FloatNode(Float value){
        this.value =value;
    }
    @Override public double evaluate()
    { return this.value;
    }

}

class AddNode implements ExpressionNode{
    ExpressionNode e1,e2;
    public AddNode(ExpressionNode x,ExpressionNode y){
        this.e1= x;
        this.e2 =y;
    }
    @Override public double evaluate()
    {
        return this.e1.evaluate()+this.e2.evaluate();
    }

}
class SubNode implements ExpressionNode{
    ExpressionNode e1,e2;
    public SubNode(ExpressionNode x,ExpressionNode y){
        this.e1= x;
        this.e2 =y;
    }
    @Override public double evaluate()
    {

        return this.e1.evaluate()-this.e2.evaluate();
    }

}
class MulNode implements ExpressionNode{
    ExpressionNode e1,e2;
    public MulNode(ExpressionNode x,ExpressionNode y){
        this.e1= x;
        this.e2 =y;
    }
    @Override public double evaluate()
    {
        return this.e1.evaluate()*this.e2.evaluate();
    }

}
class DivNode implements ExpressionNode{
    ExpressionNode e1,e2;
    public DivNode(ExpressionNode x,ExpressionNode y){
        this.e1= x;
        this.e2 =y;
    }
    @Override public double evaluate()
    {

        return this.e1.evaluate()/this.e2.evaluate();
    }

}
class PowNode implements ExpressionNode{
    ExpressionNode e1,e2;
    public PowNode(ExpressionNode x,ExpressionNode y){
        this.e1= x;
        this.e2 =y;
    }

    @Override public double evaluate()
    {
        return Math.pow(this.e1.evaluate(),this.e2.evaluate());
    }


}



