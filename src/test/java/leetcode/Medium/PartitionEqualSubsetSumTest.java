package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitionEqualSubsetSumTest {
    @Test
    public void canPartition() throws Exception {

        assertTrue(new PartitionEqualSubsetSum().canPartition(
                new int[] {
                        1, 5, 11, 5
                }
        ));

        assertFalse(new PartitionEqualSubsetSum().canPartition(
                new int[] {
                        1, 2, 3, 5
                }
        ));

    }

}