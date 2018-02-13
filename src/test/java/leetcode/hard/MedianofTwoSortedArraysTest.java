package leetcode.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class MedianofTwoSortedArraysTest {
    @Test
    public void findMedianSortedArrays() throws Exception {

        double delta = 0.001;

        assertEquals(2.0, MedianofTwoSortedArrays.findMedianSortedArrays(
                new int[] {1, 3},
                new int[] {2}
        ), delta);

        assertEquals(2.5, MedianofTwoSortedArrays.findMedianSortedArrays(
                new int[] {1, 2},
                new int[] {3, 4}
        ), delta);

        assertEquals(2.5, MedianofTwoSortedArrays.findMedianSortedArrays(
                new int[] {1, 2, 3, 4},
                null
        ), delta);

        assertEquals(2.5, MedianofTwoSortedArrays.findMedianSortedArrays(
                new int[] {1, 2, 3, 4},
                new int[]{}
        ), delta);
    }

}