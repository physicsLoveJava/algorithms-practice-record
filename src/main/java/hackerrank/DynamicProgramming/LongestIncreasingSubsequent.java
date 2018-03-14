package hackerrank.DynamicProgramming;

import java.util.Arrays;

/**
 * Problem Url: https://www.hackerrank.com/challenges/longest-increasing-subsequent/problem
 */
public class LongestIncreasingSubsequent {

    public int lengthOfLIS(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] < nums[j] && dp[i] + 1 > dp[j]) {
                    dp[j] = dp[i] + 1;
                }
                if(max < dp[j]) {
                    max = dp[j];
                }
            }
        }
        return max;
    }

}
