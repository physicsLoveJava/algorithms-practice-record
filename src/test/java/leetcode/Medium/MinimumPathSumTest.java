package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumPathSumTest {
    @Test
    public void minPathSum() throws Exception {

        assertEquals(7, MinimumPathSum.minPathSum(
                new int[][]{
                        {1, 3, 1},
                        {1, 5, 1},
                        {4, 2, 1},
                }
        ));

        assertEquals(8, MinimumPathSum.minPathSum(
                new int[][]{
                        {1, 2},
                        {5, 6},
                        {1, 1},
                }
        ));

    }

}