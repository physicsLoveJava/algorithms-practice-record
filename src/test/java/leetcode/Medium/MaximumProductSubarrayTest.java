package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumProductSubarrayTest {
    @Test
    public void maxProduct() throws Exception {

        assertEquals(6, new MaximumProductSubarray().maxProduct(
                new int[]{
                        2, 3, -2, 4
                }
        ));

        assertEquals(2, new MaximumProductSubarray().maxProduct(
                new int[]{
                        0, 2
                }
        ));

        assertEquals(18, new MaximumProductSubarray().maxProduct(
                new int[]{
                        6, 3, -10, 0, 2
                }
        ));

    }

}