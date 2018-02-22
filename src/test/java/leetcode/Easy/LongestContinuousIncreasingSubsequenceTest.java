package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestContinuousIncreasingSubsequenceTest {
    @Test
    public void findLengthOfLCIS() throws Exception {

        assertEquals(3, new LongestContinuousIncreasingSubsequence().findLengthOfLCIS(new int[] {
                1, 3, 5, 4, 7
        }));

        assertEquals(1, new LongestContinuousIncreasingSubsequence().findLengthOfLCIS(new int[] {
                2, 2, 2, 2, 2
        }));

    }

}