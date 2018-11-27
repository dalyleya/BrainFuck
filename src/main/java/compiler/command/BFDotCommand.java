package compiler.command;

import compiler.exception.CPUIndexOutOfBounds;
import entity.DecodeEntity;

/**
 * BF '.' command
 * Print current char
 */
public class BFDotCommand implements BFCommand {

    public DecodeEntity perform(DecodeEntity entity) throws CPUIndexOutOfBounds {
        entity.appendCurrentCPUCharToResponse();
        return entity;
    }
}
