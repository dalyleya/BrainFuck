package compiler.command;

import compiler.exception.BFException;
import entity.DecodeEntity;

/**
 * BF ']' command
 * Finish looping if current value of char equals to the zero
 */
public class BFRightBracketCommand implements BFCommand {

    @Override
    public DecodeEntity perform(DecodeEntity entity) throws BFException {
        if (entity.isCpuOnCurrentIndexMoreThanZero()){
            entity.increaseBracketCounter();
            while (entity.hasMoreBrackets()){
                entity.decreaseDirIndex();
                char currentDirective = entity.getDirectiveByCurrentIndex();
                if (currentDirective == '['){
                    entity.decreaseBracketCounter();
                } else if (currentDirective == ']'){
                    entity.increaseBracketCounter();
                }
            }
            entity.decreaseDirIndex();
        }
        return entity;
    }
}
