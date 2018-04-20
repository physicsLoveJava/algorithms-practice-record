package types.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinomialCoefficientTest {
    @Test
    public void combination() throws Exception {
        assertEquals(1, new BinomialCoefficient().combination(1, 0));
        assertEquals(1, new BinomialCoefficient().combination(1, 1));
        assertEquals(5, new BinomialCoefficient().combination(5, 1));
        assertEquals(10, new BinomialCoefficient().combination(5, 2));
        assertEquals(10, new BinomialCoefficient().combination(5, 3));
        assertEquals(5, new BinomialCoefficient().combination(5, 4));
        assertEquals(1, new BinomialCoefficient().combination(5, 5));
    }

}