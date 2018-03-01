package leetcode.Easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RotateArrayTest {
    @Test
    public void rotate() throws Exception {

        int[] arr = {
                1, 2, 3, 4, 5, 6
        };
        new RotateArray().rotate(
                arr, 2
        );

        System.out.println(Arrays.toString(arr));
    }

}