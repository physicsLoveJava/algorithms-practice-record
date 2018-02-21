package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/largest-number-at-least-twice-of-others
 */
public class LargestNumberAtLeastTwiceOfOthers {

    public int dominantIndex(int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }
        int maxIdx = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
                maxIdx = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(i != maxIdx) {
                if(nums[i] * 2 > max) {
                    return -1;
                }
            }
        }
        return maxIdx;
    }

}
