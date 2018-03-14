package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionEqualSubsetSumSp1Test {
    @Test
    public void canPartition() throws Exception {

        assertTrue(new PartitionEqualSubsetSumSp1().canPartition(
                new int[] {
                        1, 5, 11, 5
                }
        ));

        assertFalse(new PartitionEqualSubsetSumSp1().canPartition(
                new int[] {
                        1, 2, 3, 5
                }
        ));

    }

}