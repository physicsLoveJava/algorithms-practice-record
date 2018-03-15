package leetcode.Medium;

/**
 * https://leetcode.com/problems/partition-to-k-equal-sum-subsets/description/
 */
public class PartitiontoKEqualSumSubsets {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        if(k < 1) {
            return false;
        }
        if(!isKable(nums, k)) {
            return false;
        }
        int[] dp = new int[k];
        return compute(dp, nums, 0);
    }

    private boolean isKable(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return (sum % k) == 0;
    }

    private boolean compute(int[] dp, int[] nums, int idx) {
        if(idx > nums.length - 1) {
            return isSame(dp);
        }
        for (int i = idx; i < nums.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                dp[j] += nums[idx];
                if(compute(dp, nums, idx + 1)) {
                    return true;
                }
                dp[j] -= nums[idx];
            }
        }
        return false;
    }

    private boolean isSame(int[] dp) {
        int x = dp[0];
        for (int i = 0; i < dp.length; i++) {
            if(x != dp[i]) {
                return false;
            }
        }
        return true;
    }

}
