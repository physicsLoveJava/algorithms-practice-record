package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UglyNumberIiTest {
    @Test
    public void nthUglyNumber() throws Exception {

        assertEquals(1, new UglyNumberIi().nthUglyNumber(1));
        assertEquals(2, new UglyNumberIi().nthUglyNumber(2));
        assertEquals(3, new UglyNumberIi().nthUglyNumber(3));
        assertEquals(4, new UglyNumberIi().nthUglyNumber(4));
        assertEquals(5, new UglyNumberIi().nthUglyNumber(5));
        assertEquals(6, new UglyNumberIi().nthUglyNumber(6));
        assertEquals(8, new UglyNumberIi().nthUglyNumber(7));

    }

}