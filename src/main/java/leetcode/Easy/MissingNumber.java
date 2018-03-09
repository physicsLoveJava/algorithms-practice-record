package leetcode.Easy;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/missing-number
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] - nums[i - 1] == 1) {
                continue;
            }
            return nums[i - 1] + 1;
        }
        if (nums[0] == 0) {
            return nums[nums.length - 1] + 1;
        }else {
            return 0;
        }
    }

}
