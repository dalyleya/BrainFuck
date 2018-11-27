package compiler;

import compiler.exception.BFException;

public interface Compiler {
    String decode(char[] directives) throws BFException;
}
