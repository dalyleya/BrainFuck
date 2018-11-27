package compiler;

import compiler.exception.NegativeCPUIndexException;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommandCompilerTest {

    private Compiler compiler = new CommandCompiler();

    @Test
    public void directivesWithoutLoop() {
        String response = compiler.decode(TestHelpers.BF_HELLO_WORLD_WITHOUT_LOOP.toCharArray());
        assertEquals("Hello World!\n", response);
    }

    @Test
    public void directivesWithLoop() {
        String response = compiler.decode(TestHelpers.BF_HELLO_WORLD_WITH_LOOP.toCharArray());
        assertEquals("Hello World!\n", response);
    }

    @Test
    public void directivesZeroState() {
        String response = compiler.decode(TestHelpers.ZERO_CURRENT_STATE.toCharArray());
        assertEquals("", response);
    }


    @Test(expected = NegativeCPUIndexException.class)
    public void directivesBelowZeroThrowException(){
        compiler.decode(TestHelpers.NEGATIVE_DIRECTIVE.toCharArray());
    }

}