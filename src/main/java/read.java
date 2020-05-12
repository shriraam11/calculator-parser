

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;


public class read {
    public static void main(String[] args) throws Exception {
        try{
                Scanner s = new Scanner(System.in);
                String input=s.nextLine();

                calcLexer lexer = new calcLexer(CharStreams.fromString(input));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                calcParser parser = new calcParser(tokens);

                ParseTree tree = parser.stat(); // begin parsing at stat rule
                evalvisitor visitor = new evalvisitor();
                visitor.visit(tree);  //visiting using antlr visitor

                System.out.println(tree.toStringTree(parser));

                ConvertTree ast = new ConvertTree(); //
                ExpressionNode node;
                node= ast.visit(tree);
                Double value= node.evaluate();  // manually evaluating tree
                System.out.println(value);
        }
        catch(NullPointerException e){
            System.out.print("nullpointer");
        }
        catch (InputMismatchException e ){
            System.out.print("inputmismatch");
        }
        catch(RecognitionException e){
            System.out.print("tokennotrecognised");
        }
        catch(Exception e){
            System.out.println("exception");
        }

    }

}

