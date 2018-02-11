package leetcode.Easy;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/majority-element
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new RuntimeException();
        }
        Arrays.sort(nums);
        return (nums.length % 2 == 0) ? nums[nums.length / 2] : nums[(nums.length + 1) / 2];
    }

}
