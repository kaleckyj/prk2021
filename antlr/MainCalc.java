import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Stack;

public class MainCalc {
    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream(args[0]);
        CalcLexer lexer = new CalcLexer(new ANTLRInputStream(inputStream));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokens);
        ParseTree tree = parser.calc();
        MyCalcListener lis = new MyCalcListener();
        ParseTreeWalker.DEFAULT.walk(lis, tree);

        System.out.println("Vysledky pocetnich operaci:");
        for(Num num : lis.stack) {
            if(num.value == (long) num.value) { System.out.println((long)num.value); }
            else { System.out.println(num.value); }
        }
        System.out.println("Hodnoty promennych:");
        for(Var var : lis.vars) {
            System.out.println("Promenna " + var.name + " = " + var.num.value);
        }
    }
}