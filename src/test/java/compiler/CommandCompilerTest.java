package compiler;

import compiler.exception.BFException;
import compiler.exception.NegativeCPUValueException;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommandCompilerTest {

    private Compiler compiler = new CommandCompiler();

    @Test
    public void directivesWithoutLoop() throws BFException {
        String response = compiler.decode(TestHelpers.BF_HELLO_WORLD_WITHOUT_LOOP.toCharArray());
        assertEquals("Hello World!\n", response);
    }

    @Test
    public void directivesWithLoop() throws BFException {
        String response = compiler.decode(TestHelpers.BF_HELLO_WORLD_WITH_LOOP.toCharArray());
        assertEquals("Hello World!\n", response);
    }

    @Test
    public void directivesZeroState() throws BFException {
        String response = compiler.decode(TestHelpers.ZERO_CURRENT_STATE.toCharArray());
        assertEquals("", response);
    }


    @Test(expected = NegativeCPUValueException.class)
    public void directivesBelowZeroThrowException() throws BFException {
        compiler.decode(TestHelpers.NEGATIVE_DIRECTIVE.toCharArray());
    }

}