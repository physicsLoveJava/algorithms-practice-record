package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerBreakTest {
    @Test
    public void integerBreak() throws Exception {

        assertEquals(1, new IntegerBreak().integerBreak(2));
        assertEquals(2, new IntegerBreak().integerBreak(3));
        assertEquals(36, new IntegerBreak().integerBreak(10));
        assertEquals(54, new IntegerBreak().integerBreak(11));

    }

}