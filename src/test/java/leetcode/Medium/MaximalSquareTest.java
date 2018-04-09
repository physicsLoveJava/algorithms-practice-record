package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximalSquareTest {
    @Test
    public void maximalSquare() throws Exception {

        assertEquals(0, new MaximalSquare().maximalSquare(new char[][] {
                {'0'},
        }));

        assertEquals(4, new MaximalSquare().maximalSquare(new char[][] {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'},
        }));

    }

}