package leetcode.Medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/partition-to-k-equal-sum-subsets/description/
 */
public class PartitiontoKEqualSumSubsetsSp1 {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        if(k < 1) {
            return false;
        }
        int sum = sum(nums);
        int subSum = sum / k;
        if((sum % k) != 0) {
            return false;
        }
        int[] dp = new int[k];
        Arrays.sort(nums);
        int len = nums.length - 1;
        if(nums[len] > subSum) {
            return false;
        }
        while(len >= 0 && nums[len] == subSum) {
            len --;
            k--;
        }
        return compute(dp, subSum, nums, 0, len, k);
    }

    private int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    private boolean compute(int[] dp, int subSum, int[] nums, int idx, int len, int k) {
        if(len < 0) {
            return true;
        }
        if(idx > len) {
            return isSame(dp, k);
        }
        for (int j = 0; j < k; j++) {
            if(dp[j] + nums[idx] <= subSum) {
                dp[j] += nums[idx];
                if(compute(dp, subSum, nums, idx + 1, len, k)) {
                    return true;
                }
                dp[j] -= nums[idx];
            }
            //key
            if(dp[j] == 0) {
                break;
            }
        }
        return false;
    }

    private boolean isSame(int[] dp, int k) {
        int x = dp[0];
        for (int i = 0; i < k; i++) {
            if(x != dp[i]) {
                return false;
            }
        }
        return true;
    }

}
