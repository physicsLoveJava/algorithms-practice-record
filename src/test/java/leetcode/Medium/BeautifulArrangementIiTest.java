package leetcode.Medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BeautifulArrangementIiTest {
    @Test
    public void constructArray() throws Exception {

        int[] arr1 = new BeautifulArrangementIi().constructArray(3, 1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = new BeautifulArrangementIi().constructArray(3, 2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new BeautifulArrangementIi().constructArray(5, 3);
        System.out.println(Arrays.toString(arr3));

    }

}