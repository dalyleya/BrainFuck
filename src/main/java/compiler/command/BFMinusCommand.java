package compiler.command;

import compiler.exception.BFException;
import entity.DecodeEntity;

/**
 * BF '-' command
 * Decrease current element of array
 */
public class BFMinusCommand implements BFCommand {

    public DecodeEntity perform(DecodeEntity entity) throws BFException {
        entity.decreaseCPUByIndex();
        return entity;
    }
}
