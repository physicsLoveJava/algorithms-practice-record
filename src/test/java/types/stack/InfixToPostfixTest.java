package types.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InfixToPostfixTest {
    @Test
    public void infixToPostfix() throws Exception {
        assertEquals("ABC*+", new InfixToPostfix().infixToPostfix("A + B * C"));
        assertEquals("AB+C-D+", new InfixToPostfix().infixToPostfix("A+B-C+D"));
        assertEquals("AB*CD+-E+", new InfixToPostfix().infixToPostfix("A * B- (C + D) + E"));
    }

}