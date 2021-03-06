import compiler.CommandCompiler;
import compiler.Compiler;
import compiler.exception.BFException;

import java.util.Scanner;

public class Starter {

    public static void main(String[] args) {
        String bfDirectives = inputDataFromConsole();
        Compiler compiler = new CommandCompiler();
        String response = null;
        try {
            response = compiler.decode(parseString(bfDirectives));
        } catch (BFException e) {
            System.out.printf("Wrong data inserted %s", e.getCause());
        }
        System.out.print("Compiled version is :\n" + response);
    }

    private static String inputDataFromConsole() {
        System.out.println("Insert BF code. \nType 'f' when finished.");

        try (Scanner sc = new Scanner(System.in)) {
            StringBuilder sb = new StringBuilder();
            while (sc.hasNext()) {
                String next = sc.next();
                if (next.equals("f")) {
                    break;
                }
                sb.append(next);
            }
            return sb.toString();
        }
    }

    private static char[] parseString(String bfDirectives) {
        return bfDirectives.toCharArray();
    }
}
