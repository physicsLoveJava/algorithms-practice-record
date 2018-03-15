package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartitiontoKEqualSumSubsetsSp1Test {
    @Test
    public void canPartitionKSubsets() throws Exception {

        assertTrue(new PartitiontoKEqualSumSubsetsSp1().canPartitionKSubsets(
                new int[]{
                        4, 3, 2, 3, 5, 2, 1
                },
                4
        ));


        assertFalse(new PartitiontoKEqualSumSubsetsSp1().canPartitionKSubsets(
                new int[]{
                        4, 3, 2, 3, 5, 2, 2
                },
                4
        ));

        assertTrue(new PartitiontoKEqualSumSubsetsSp1().canPartitionKSubsets(
                new int[]{
                        1, 1, 1, 1, 1, 1, 1, 1, 1, 1
                },
                5
        ));

    }

}