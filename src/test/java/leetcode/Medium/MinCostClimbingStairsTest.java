package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinCostClimbingStairsTest {
    @Test
    public void minCostClimbingStairs() throws Exception {
        assertEquals(15, MinCostClimbingStairs.minCostClimbingStairs(new int[]{15}));
        assertEquals(15, MinCostClimbingStairs.minCostClimbingStairs(new int[]{15, 20}));
        assertEquals(20, MinCostClimbingStairs.minCostClimbingStairs(new int[]{15, 20, 25}));
        assertEquals(6, MinCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }

    @Test
    public void testFailed() {
        assertEquals(1, MinCostClimbingStairs.minCostClimbingStairs(new int[]{0,0,1,1}));
    }

}