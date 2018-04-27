package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContinuousSubarraySumTest {
    @Test
    public void checkSubarraySum() throws Exception {
        assertTrue(new ContinuousSubarraySum().checkSubarraySum(
                new int[] {
                        23, 2, 4, 6, 7
                },
                6
        ));

        assertTrue(new ContinuousSubarraySum().checkSubarraySum(
                new int[] {
                        23, 2, 6, 4, 7
                },
                6
        ));

        assertFalse(new ContinuousSubarraySum().checkSubarraySum(
                new int[] {
                        23, 2, 6, 4, 7
                },
                0
        ));

        assertTrue(new ContinuousSubarraySum().checkSubarraySum(
                new int[] {
                        0, 0
                },
                -1
        ));
    }

}