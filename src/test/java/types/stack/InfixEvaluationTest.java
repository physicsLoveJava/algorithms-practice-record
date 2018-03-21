package types.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InfixEvaluationTest {
    @Test
    public void eval() throws Exception {

        assertEquals(Integer.valueOf(2), new InfixEvaluation().eval("1+2*3-5"));

    }

}