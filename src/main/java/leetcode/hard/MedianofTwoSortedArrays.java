package leetcode.hard;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 */
public class MedianofTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1 == null || nums1.length == 0) {
            return singleMedian(nums2);
        }
        if(nums2 == null || nums2.length == 0) {
            return singleMedian(nums1);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });
        int totalLen = nums1.length + nums2.length;
        int k = totalLen / 2 + 1;
        for (int i = 0; i < nums1.length; i++) {
            queue.add(nums1[i]);
            if(queue.size() > k) {
                queue.poll();
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            queue.add(nums2[i]);
            if(queue.size() > k) {
                queue.poll();
            }
        }
        return totalLen % 2 == 0 ?
                (queue.poll() + queue.poll()) / 2.0 :
                queue.poll();
    }

    private static double singleMedian(int[] nums1) {
        if(nums1 == null || nums1.length == 0) {
            return 0;
        }
        int len = nums1.length;
        if(len % 2 == 1) {
            return nums1[len / 2];
        }
        return (nums1[len / 2] + nums1[len / 2 - 1]) / 2.0;
    }

}
