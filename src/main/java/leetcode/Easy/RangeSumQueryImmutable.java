package leetcode.Easy;

import util.PrintUtils;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/range-sum-query-immutable
 */
public class RangeSumQueryImmutable {

    public static class NumArray {

        int[] dp;

        public NumArray(int[] nums) {
            if(nums == null || nums.length == 0) {
                dp = new int[0];
            }else {
                dp = new int[nums.length + 1];
                dp[0] = nums[0];
                for (int i = 1; i < nums.length; i++) {
                    dp[i] = dp[i - 1] + nums[i];
                }
                System.out.println(Arrays.toString(dp));
            }
        }

        public int sumRange(int i, int j) {
            if(i > j) {
                throw new IllegalArgumentException();
            }
            if(i == 0) {
                return dp[j];
            }
            return dp[j] - dp[i - 1];
        }
    }

}
