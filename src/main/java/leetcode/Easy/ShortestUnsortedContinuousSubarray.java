package leetcode.Easy;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/shortest-unsorted-continuous-subarray
 */
public class ShortestUnsortedContinuousSubarray {

    public int findUnsortedSubarray(int[] nums) {
        if(nums == null || nums.length == 0) {
            throw new IllegalArgumentException();
        }
        int[] dest = new int[nums.length];
        System.arraycopy(nums, 0, dest, 0, nums.length);
        Arrays.sort(dest);
        int i = 0, j = nums.length - 1;
        boolean left = false, right = false;
        while(i < j ) {
            if(!left && dest[i] == nums[i]) {
                i ++;
            }else {
                left = true;
            }
            if(!right && dest[j] == nums[j]) {
                j --;
            }else {
                right = true;
            }
            if(right && left) {
                break;
            }
        }
        return i == j ? 0 : j - i + 1;
    }

}
