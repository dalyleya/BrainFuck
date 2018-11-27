package compiler;

import compiler.command.*;
import compiler.exception.BFException;
import compiler.exception.UnknownBFDirectiveException;
import entity.DecodeEntity;

public class CommandCompiler implements Compiler {
    private BFCommand leftBracket = new BFLeftBracketCommand();
    private BFCommand rightBracket = new BFRightBracketCommand();
    private BFCommand left = new BFLeftCommand();
    private BFCommand right = new BFRightCommand();
    private BFCommand plus = new BFPlusCommand();
    private BFCommand minus = new BFMinusCommand();
    private BFCommand dot = new BFDotCommand();

    @Override
    public String decode(char[] directives) throws BFException {

        DecodeEntity entity = new DecodeEntity(directives);
        while (entity.getDirIndex() < directives.length) {
            switch (directives[entity.getDirIndex()]) {

                case '>':
                    right.perform(entity);
                    break;

                case '<':
                    left.perform(entity);
                    break;

                case '+':
                    plus.perform(entity);
                    break;

                case '-':
                    minus.perform(entity);
                    break;

                case '.':
                    dot.perform(entity);
                    break;

                case '[':
                    leftBracket.perform(entity);
                    break;

                case ']':
                    rightBracket.perform(entity);
                    break;

                default:
                    throw new UnknownBFDirectiveException();

            }
            entity.increaseDirIndex();
        }

        return entity.getResponse();
    }

}
