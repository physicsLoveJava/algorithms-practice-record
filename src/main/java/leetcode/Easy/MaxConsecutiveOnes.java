package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/max-consecutive-ones
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int cur = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                cur ++;
            }else {
                if(max < cur) {
                    max = cur;
                }
                cur = 0;
            }
        }
        return max < cur ? cur : max;
    }

}
