package compiler.command;

import compiler.exception.NegativeCPUIndexException;
import entity.DecodeEntity;

/**
 * BF '<' command
 * Shift array index one position to the left
 */
public class BFLeftCommand implements BFCommand {

    public DecodeEntity perform(DecodeEntity entity) throws NegativeCPUIndexException {
        entity.decreaseCPUIndex();
        return entity;
    }
}
