package leetcode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/largest-divisible-subset
 */
public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int[][] dp = new int[nums.length][nums.length];
        int max = 0, maxIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(max < compute(nums, dp, i, j)) {
                    max = compute(nums, dp, i, j);
                    maxIdx = j;
                }
            }
        }
        for (int[] sub : dp) {
            System.out.println(Arrays.toString(sub));
        }
        List<Integer> rs = new ArrayList<>();
        int[] arr = new int[max];
        int idx = 0;
        int val = max;
        int i = maxIdx;
        while(i >= 0 && val >= 1) {
            if(dp[0][i] == val && nums[maxIdx] % nums[i] == 0) {
                arr[idx++] = nums[i];
                val--;
            }
            i--;
        }
        for (int j = max - 1; j >= 0; j--) {
            rs.add(arr[j]);
        }
        return rs;
    }

    private int compute(int[] nums, int[][] dp, int s, int e) {
        if(s > dp.length - 1 || e < 0) {
            return 0;
        }
        if(dp[s][e] != 0) {
            return dp[s][e];
        }
        if(e == s) {
            return dp[s][e] = 1;
        }
        int count = 1;
        for (int i = s; i < e; i++) {
            int tmp = 0;
            if(nums[e] % nums[i] == 0) {
                tmp = compute(nums, dp, s, i) + 1;
            }
            if(tmp > count) {
                count = tmp;
            }
        }
        return dp[s][e] = count;
    }

}
