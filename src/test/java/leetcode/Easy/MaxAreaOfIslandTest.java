package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxAreaOfIslandTest {
    @Test
    public void maxAreaOfIsland() throws Exception {

        assertEquals(5, new MaxAreaOfIsland().maxAreaOfIsland(
                new int[][] {
                        {0, 0, 1, 0, 0},
                        {0, 1, 1, 1, 0},
                        {0, 0, 0, 1, 0},
                        {0, 1, 1, 0, 0},
                        {0, 0, 1, 1, 0},
                }
        ));

    }

}