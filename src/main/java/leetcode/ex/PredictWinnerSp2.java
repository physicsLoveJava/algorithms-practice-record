package leetcode.ex;

/**
 * https://leetcode.com/problems/predict-the-winner/description/
 */
public class PredictWinnerSp2 {

    public boolean PredictTheWinner(int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }
        int[] dp = new int[nums.length + 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 1; j <= nums.length -1; j++) {
                dp[j] = Math.max(
                        nums[i] - dp[j],
                        nums[j] - dp[j - 1]
                );
            }
        }
        return dp[nums.length - 1] >= 0;
    }

}
