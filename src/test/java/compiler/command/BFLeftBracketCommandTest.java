package compiler.command;

import entity.DecodeEntity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BFLeftBracketCommandTest {

    private BFLeftBracketCommand command;

    @Before
    public void setUp() {
        command = new BFLeftBracketCommand();
    }

    @Test
    public void doNothingIfCurrentValueNotZero() {
        char[] simpleDirectives = new char[]{'+', '[', '>', '+', ']', '+'};

        DecodeEntity inputEntity = new DecodeEntity(simpleDirectives);
        inputEntity.setCpu(new char[]{1, 0, 0, 0, 0});
        inputEntity.setDirIndex(1);
        inputEntity.setCpuIndex(0);
        DecodeEntity responseEntity = command.perform(inputEntity);

        Assert.assertEquals("", responseEntity.getResponse());
        Assert.assertEquals(1, responseEntity.getDirIndex());
        Assert.assertEquals(0, responseEntity.getCpuIndex());
        Assert.assertEquals(0, responseEntity.getBracketCount());
    }

    @Test
    public void moveCursorIfCurrentValueZero() {
        char[] simpleDirectives = new char[]{'[', '>', '+', ']', '+'};
        DecodeEntity inputEntity = new DecodeEntity(simpleDirectives);
        DecodeEntity responseEntity = command.perform(inputEntity);
        Assert.assertEquals("", responseEntity.getResponse());
        Assert.assertEquals(3, responseEntity.getDirIndex());
        Assert.assertEquals(0, responseEntity.getCpuIndex());
        Assert.assertEquals(0, responseEntity.getBracketCount());
    }
}