package compiler.command;

import entity.DecodeEntity;

/**
 * BF '>' command
 * Shift array index one position to the right
 */
public class BFRightCommand implements BFCommand {

    public DecodeEntity perform(DecodeEntity entity) {
        entity.increaseCPUIndex();
        return entity;
    }
}
