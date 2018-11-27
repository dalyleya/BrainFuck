package compiler.command;

import compiler.exception.CPUIndexOutOfBounds;
import entity.DecodeEntity;

/**
 * BF '>' command
 * Shift array index one position to the right
 */
public class BFRightCommand implements BFCommand {

    public DecodeEntity perform(DecodeEntity entity) throws CPUIndexOutOfBounds {
        entity.increaseCPUIndex();
        return entity;
    }
}
