package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumLengthofRepeatedSubarrayTest {

    @Test
    public void findLength() throws Exception {

        assertEquals(3, MaximumLengthofRepeatedSubarray.findLength(
                new int[]{1, 2, 3, 2, 1},
                new int[]{3, 2, 1, 4, 7}
        ));

    }

}