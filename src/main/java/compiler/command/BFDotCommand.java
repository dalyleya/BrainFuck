package compiler.command;

import entity.DecodeEntity;

/**
 * BF '.' command
 * Print current char
 */
public class BFDotCommand implements BFCommand {

    public DecodeEntity perform(DecodeEntity entity) {
        entity.appendCurrentCPUCharToResponse();
        return entity;
    }
}
