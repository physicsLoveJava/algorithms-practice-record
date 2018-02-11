package leetcode.Easy;

import util.PrintUtils;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/maximum-subarray
 */
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            dp[i] = Math.max(
                    nums[i - 1],
                    dp[i - 1] + nums[i - 1]
            );
        }
        int max = dp[1];
        for (int i = 1; i < dp.length; i++) {
            if(max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }
}
