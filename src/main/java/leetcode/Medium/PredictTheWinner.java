package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/predict-the-winner
 */
public class PredictTheWinner {

    public boolean PredictTheWinner(int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }
        int[][] dp = new int[nums.length][nums.length];
        return possibleWinner(nums, dp, 0, nums.length - 1) >= 0;
    }

    private int possibleWinner(int[] nums, int[][] dp, int left, int right) {
        if(left == right) {
            return nums[left];
        }
        if(dp[left][right] != 0) {
            return dp[left][right];
        }
        int a = nums[left] - possibleWinner(nums, dp, left + 1, right);
        int b = nums[right] - possibleWinner(nums, dp, left, right - 1);
        dp[left][right] = Math.max(a, b);
        return dp[left][right];
    }

}
