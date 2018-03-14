package leetcode.Medium;

import util.PrintUtils;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/partition-equal-subset-sum
 */
public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if(sum % 2 != 0) {
            return false;
        }
        int subSum = sum / 2;

        boolean[][] dp = new boolean[subSum + 1][nums.length];
        return compute(dp, nums, subSum, 0);
    }

    private boolean compute(boolean[][] dp, int[] nums, int sum, int idx) {
        if(sum < 0) {
            return false;
        }
        if(idx > nums.length - 1) {
            return false;
        }
        if(sum == 0) {
            System.out.println(sum + ":" + idx);
            return dp[sum][idx] = true;
        }
        return dp[sum][idx] = compute(dp, nums, sum - nums[idx], idx + 1)
                || compute(dp, nums, sum, idx + 1);
    }

}
