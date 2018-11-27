package compiler.command;

import compiler.exception.BFException;
import entity.DecodeEntity;

public interface BFCommand {

    DecodeEntity perform(DecodeEntity entity) throws BFException;
}
