
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.*;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class read {
    public static void main(String[] args) throws Exception {
        try{
                Scanner s = new Scanner(System.in);
                String str=s.nextLine();
//        String file="input";
//
                calcLexer lexer = new calcLexer(CharStreams.fromString(str));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                calcParser parser = new calcParser(tokens);
                ParseTree tree = parser.stat(); // begin parsing at init rule
                evalvisitor visitor = new evalvisitor();
                visitor.visit(tree);
                //lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
                //parser.removeErrorListeners();
                System.out.println(tree.toStringTree(parser));
        }
        catch(NullPointerException e){
            System.out.print("input doesnt match or incomplete expression");
        }
        catch (InputMismatchException e ){
            System.out.print("input doesnt match or incomplete expression");
        }
        catch(RecognitionException e){
            System.out.print("input doesnt match or incomplete expression");
        }

    }

}

