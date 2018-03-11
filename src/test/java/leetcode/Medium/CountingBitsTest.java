package leetcode.Medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CountingBitsTest {
    @Test
    public void countBits() throws Exception {

        int[] arr = new CountingBits().countBits(10);
        System.out.println(Arrays.toString(arr));

    }

}