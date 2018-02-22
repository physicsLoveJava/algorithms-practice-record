package leetcode.ex;

/**
 * https://leetcode.com/problems/predict-the-winner/description/
 */
public class PredictWinnerSp1 {

    public boolean PredictTheWinner(int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }
        int[][] dp = new int[nums.length + 1][nums.length + 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 1; j <= nums.length -1; j++) {
                dp[i][j] = Math.max(
                        nums[i] - dp[i + 1][j],
                        nums[j] - dp[i][j - 1]
                );
            }
        }
        return dp[0][nums.length - 1] >= 0;
    }

}
