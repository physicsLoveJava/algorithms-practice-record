package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitiontoKEqualSumSubsetsTest {
    @Test
    public void canPartitionKSubsets() throws Exception {

        assertTrue(new PartitiontoKEqualSumSubsets().canPartitionKSubsets(
                new int[] {
                        4, 3, 2, 3, 5, 2, 1
                },
                4
        ));

        assertFalse(new PartitiontoKEqualSumSubsets().canPartitionKSubsets(
                new int[] {
                        4, 3, 2, 3, 5, 2, 2
                },
                4
        ));

    }

}