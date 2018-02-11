package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubarrayTest {
    @Test
    public void maxSubArray() throws Exception {

        assertEquals(6, MaximumSubarray.maxSubArray(
                new int[] {
                        -2,1,-3,4,-1,2,1,-5,4
                }
        ));


        assertEquals(-1, MaximumSubarray.maxSubArray(
                new int[] {
                        -1
                }
        ));

    }

}