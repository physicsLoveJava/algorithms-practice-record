package leetcode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/largest-divisible-subset
 */
public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        int[] prev = new int[nums.length];
        int max = 0, maxIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            prev[i] = -1;
            for (int j = i - 1; j >= 0; j --) {
                if(nums[i] % nums[j] == 0) {
                    if(dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1;
                        prev[i] = j;
                    }
                }
            }
            if(dp[i] > max) {
                max = dp[i];
                maxIdx = i;
            }
        }
        List<Integer> rs = new ArrayList<>();
        int idx = maxIdx;
        while(idx != -1) {
            rs.add(nums[idx]);
            idx = prev[idx];
        }
        return rs;
    }

        
}
