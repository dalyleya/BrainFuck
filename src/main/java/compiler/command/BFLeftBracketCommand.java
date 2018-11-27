package compiler.command;

import compiler.exception.BFException;
import entity.DecodeEntity;

/**
 * BF '[' command
 * Start loop if current value of char more than zero
 */
public class BFLeftBracketCommand implements BFCommand {

    public DecodeEntity perform(DecodeEntity entity) throws BFException {
        if (entity.isCpuOnCurrentIndexEqualsZero()){
            entity.increaseBracketCounter();
            while (entity.hasMoreBrackets()){
                entity.increaseDirIndex();
                char currentDirective = entity.getDirectiveByCurrentIndex();
                if (currentDirective == '['){
                    entity.increaseBracketCounter();
                } else if (currentDirective == ']'){
                    entity.decreaseBracketCounter();
                }
            }
        }
        return entity;
    }
}
