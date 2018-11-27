package compiler.command;

import entity.DecodeEntity;

/**
 * BF '+' command
 * Increase current element of array
 */
public class BFPlusCommand implements BFCommand {

    public DecodeEntity perform(DecodeEntity entity) {
        entity.increaseCPUByIndex();
        return entity;
    }
}
