package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfLongestIncreasingSubsequenceTest {

    @Test
    public void findNumberOfLIS() throws Exception {

        assertEquals(5, NumberOfLongestIncreasingSubsequence.findNumberOfLIS(
                new int[] {
                        2, 2, 2, 2, 2
                }
        ));

        assertEquals(2, NumberOfLongestIncreasingSubsequence.findNumberOfLIS(
                new int[] {
                        1, 3, 5, 4, 7
                }
        ));

    }

}