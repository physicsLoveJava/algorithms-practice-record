package leetcode.Medium;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Problem Url: https://leetcode.com/problems/kth-largest-element-in-an-array
 */
public class KthLargestElementInAnArray {

    public static int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k < 1) {
            throw new IllegalArgumentException();
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });
        for (int i = 0; i < nums.length; i++) {
            queue.add(nums[i]);
        }
        int count = 0;
        while(!queue.isEmpty()) {
            Integer val = queue.poll();
            count++;
            if(count == k) {
                return val;
            }
        }
        throw new IllegalArgumentException();
    }

}
