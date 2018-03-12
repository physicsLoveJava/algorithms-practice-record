package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProductOfArrayExceptSelfTest {
    @Test
    public void productExceptSelf() throws Exception {

        assertArrayEquals(new int[] {
                24, 12, 8, 6
        }, new ProductOfArrayExceptSelf().productExceptSelf(
                new int[] {
                        1, 2, 3, 4
                }
        ));

    }

}