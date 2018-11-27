package compiler.command;

import entity.DecodeEntity;

/**
 * BF '<' command
 * Shift array index one position to the left
 */
public class BFLeftCommand implements BFCommand {

    public DecodeEntity perform(DecodeEntity entity) {
        entity.decreaseCPUIndex();
        return entity;
    }
}
