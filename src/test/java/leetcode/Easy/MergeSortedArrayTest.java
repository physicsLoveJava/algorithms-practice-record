package leetcode.Easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {
    @Test
    public void merge() throws Exception {

        int[] vals = {
                1, 3, 5, 7, 0, 0, 0
        };
        MergeSortedArray.merge(vals, 4, new int[] {
                2, 4, 4
        }, 3);

        System.out.println(Arrays.toString(vals));


    }

    @Test
    public void merge2() throws Exception {

        int[] vals = {
                0
        };
        MergeSortedArray.merge(vals, 0, new int[] {
                1
        }, 1);

        System.out.println(Arrays.toString(vals));


    }

}