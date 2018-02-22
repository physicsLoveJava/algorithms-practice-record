package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/longest-continuous-increasing-subsequence
 */
public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int prev = 1;
        int cur = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > nums[i - 1]) {
                cur ++;
                prev = Math.max(prev, cur);
            }else {
                prev = Math.max(prev, cur);
                cur = 1;
            }
        }
        return prev;
    }

}
