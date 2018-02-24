package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/maximum-average-subarray-i
 */
public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }
        int[] arr = new int[nums.length];
        System.arraycopy(nums, 0, arr, 0, nums.length);
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        Integer max = arr[k - 1];
        for (int i = k; i < nums.length; i++) {
            int cur = arr[i] - arr[i - k];
            if(cur > max) {
                max = cur;
            }
        }
        return (double) max / k;
    }

}
