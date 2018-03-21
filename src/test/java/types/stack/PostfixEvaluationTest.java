package types.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PostfixEvaluationTest {
    @Test
    public void eval() throws Exception {

        assertEquals(Integer.valueOf(2), new PostfixEvaluation().eval("123*+5-"));

    }

}