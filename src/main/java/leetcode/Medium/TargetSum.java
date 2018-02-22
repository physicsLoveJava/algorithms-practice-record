package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/target-sum
 */
public class TargetSum {

    public int findTargetSumWays(int[] nums, int sum) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int[][] dp = new int[nums.length][2001];
        dp[0][nums[0] + 1000] = 1;
        dp[0][-nums[0] + 1000] += 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = -1000; j <= 1000; j ++) {
                if(dp[i - 1][j + 1000] > 0) {
                    dp[i][j + nums[i] + 1000] += dp[i - 1][j + 1000];
                    dp[i][j - nums[i] + 1000] += dp[i - 1][j + 1000];
                }
            }
        }
        return sum > 1000 ? 0 : dp[nums.length - 1][sum + 1000];
    }

}
