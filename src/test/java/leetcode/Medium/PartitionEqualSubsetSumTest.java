package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionEqualSubsetSumTest {
    @Test
    public void wrong_1() {
        assertFalse(PartitionEqualSubsetSum.canPartitionKSubsets(
                new int[] {
                        4, 4, 4, 8
                },
                4
        ));
    }

    @Test
    public void wrong_2() {
        assertFalse(PartitionEqualSubsetSum.canPartitionKSubsets(
                new int[] {
                        2,2,2,2,3,4,5
                },
                4
        ));
    }

    @Test
    public void right_1() {
        assertTrue(PartitionEqualSubsetSum.canPartitionKSubsets(
                new int[] {
                        4, 3, 2, 3, 5, 2, 1
                },
                4
        ));
    }

    @Test
    public void canPartitionKSubsets() throws Exception {
        //15, 1
        //11, 4, 1
        //10, 3, 1, 1, 1
        assertTrue(PartitionEqualSubsetSum.canPartitionKSubsets(
                new int[] {
                        4,15,1,1,1,1,3,11,1,10
                },
                3
        ));

    }

}