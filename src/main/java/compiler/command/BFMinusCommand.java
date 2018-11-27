package compiler.command;

import entity.DecodeEntity;

/**
 * BF '-' command
 * Decrease current element of array
 */
public class BFMinusCommand implements BFCommand {

    public DecodeEntity perform(DecodeEntity entity) {
        entity.decreaseCPUByIndex();
        return entity;
    }
}
