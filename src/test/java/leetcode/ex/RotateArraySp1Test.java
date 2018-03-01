package leetcode.ex;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RotateArraySp1Test {
    @Test
    public void rotate() throws Exception {

        int[] arr = {
                1, 2, 3, 4, 5, 6
        };
        new RotateArraySp1().rotate(
                arr, 2
        );

        System.out.println(Arrays.toString(arr));
    }

}