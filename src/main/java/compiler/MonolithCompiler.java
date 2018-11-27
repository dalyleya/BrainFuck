package compiler;

public class MonolithCompiler implements Compiler {


    @Override
    public String decode(char[] directives) {
        char[] cpu = new char[30000];

        StringBuilder response = new StringBuilder();

        int j = 0;
        int brc = 0;
        for (int i = 0; i < directives.length; i++) {
            switch (directives[i]) {

                case '>':
                    j++;
                    break;

                case '<':
                    j--;
                    break;

                case '+':
                    cpu[j]++;
                    break;

                case '-':
                    cpu[j]--;
                    break;

                case '.':
                    response.append(cpu[j]);
                    break;

                case '[':
                    if (cpu[j] == 0) {
                        brc++;
                        while (brc > 0) {
                            i++;
                            if (directives[i] == '[')
                                brc++;
                            if (directives[i] == ']')
                                brc--;
                        }
                    }
                    break;

                case ']':
                    if (cpu[j] != 0) {
                        brc++;
                        while (brc > 0) {
                            i--;
                            if (directives[i] == '[') {
                                brc--;
                            }
                            if (directives[i] == ']') {
                                brc++;
                            }
                        }
                        i--;
                    }
                    break;
            }
        }


        return response.toString();
    }
}
