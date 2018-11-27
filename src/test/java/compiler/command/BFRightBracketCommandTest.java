package compiler.command;

import entity.DecodeEntity;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BFRightBracketCommandTest {
    private BFCommand command;

    @Before
    public void setUp() {
        command = new BFRightBracketCommand();
    }

    @Test
    public void moveCursorBackIfCurrentValueNotZero() throws Exception {
        char[] simpleDirectives = new char[]{'+', '[', '>', '+', ']', '+'};

        DecodeEntity inputEntity = new DecodeEntity(simpleDirectives);
        inputEntity.setCpu(new char[]{1, 0, 0, 0, 0, 0});
        inputEntity.setDirIndex(4);
        inputEntity.setCpuIndex(0);

        DecodeEntity responseEntity = command.perform(inputEntity);

        assertEquals("", responseEntity.getResponse());
        assertEquals(0, responseEntity.getDirIndex());
        assertEquals(0, responseEntity.getCpuIndex());
        assertEquals(0, responseEntity.getBracketCount());
    }

    @Test
    public void doNothingIfCurrentValueZero() throws Exception {
        char[] simpleDirectives = new char[]{'[', '>', '+', ']', '+'};
        DecodeEntity inputEntity = new DecodeEntity(simpleDirectives);
        inputEntity.setCpu(new char[]{0, 1, 0, 0, 0});
        inputEntity.setCpuIndex(0);
        inputEntity.setDirIndex(3);

        DecodeEntity responseEntity = command.perform(inputEntity);

        assertEquals("", responseEntity.getResponse());
        assertEquals(3, responseEntity.getDirIndex());
        assertEquals(0, responseEntity.getCpuIndex());
        assertEquals(0, responseEntity.getBracketCount());
    }

}