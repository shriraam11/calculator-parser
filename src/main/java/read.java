
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;


import java.util.Scanner;


public class read {
    public static void main(String[] args) throws Exception {

//        Scanner s = new Scanner(System.in);
//         String str=s.nextLine();
        String file="input";

        calcLexer lexer = new calcLexer(CharStreams.fromFileName(file));


        CommonTokenStream tokens = new CommonTokenStream(lexer);

        calcParser parser = new calcParser(tokens);
        ParseTree tree = parser.stat(); // begin parsing at init rule
       evalvisitor visitor = new evalvisitor();
        visitor.visit(tree);

        System.out.println(tree.toStringTree(parser));
    }

}

