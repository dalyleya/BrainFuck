package compiler.command;

import entity.DecodeEntity;

public interface BFCommand {
    DecodeEntity perform(DecodeEntity entity) throws Exception;
}
