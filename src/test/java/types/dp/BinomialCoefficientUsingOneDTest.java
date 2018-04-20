package types.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinomialCoefficientUsingOneDTest {
    @Test
    public void combination() throws Exception {
        assertEquals(1, new BinomialCoefficientUsingOneD().combination(1, 0));
        assertEquals(1, new BinomialCoefficientUsingOneD().combination(1, 1));
        assertEquals(5, new BinomialCoefficientUsingOneD().combination(5, 1));
        assertEquals(10, new BinomialCoefficientUsingOneD().combination(5, 2));
        assertEquals(10, new BinomialCoefficientUsingOneD().combination(5, 3));
        assertEquals(5, new BinomialCoefficientUsingOneD().combination(5, 4));
        assertEquals(1, new BinomialCoefficientUsingOneD().combination(5, 5));
    }

}