package leetcode.Easy;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/house-robber
 */
public class HouseRobber {

    public static int rob(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        if(nums.length == 1) {
            return nums[0];
        }

        int[] dp = new int[nums.length + 1];

        dp[0] = 0;
        dp[1] = nums[0];

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(
                    dp[i - 1],
                    dp[i - 2] + nums[i - 1]
            );
        }

        return dp[nums.length];
    }

}
