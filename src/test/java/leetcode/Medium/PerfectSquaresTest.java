package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectSquaresTest {
    @Test
    public void numSquares() throws Exception {

        assertEquals(1, new PerfectSquares().numSquares(1));
        assertEquals(2, new PerfectSquares().numSquares(2));
        assertEquals(2, new PerfectSquares().numSquares(5));
        assertEquals(3, new PerfectSquares().numSquares(12));

    }

}