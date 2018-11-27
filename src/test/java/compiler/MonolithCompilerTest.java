package compiler;

import compiler.exception.BFException;
import org.junit.Test;

import static org.junit.Assert.*;

public class MonolithCompilerTest {


    private Compiler compiler = new MonolithCompiler();

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

}