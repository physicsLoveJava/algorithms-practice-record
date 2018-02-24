package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/non-decreasing-array
 */
public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        if(nums == null || nums.length == 0) {
            return true;
        }
        Integer idx = null;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i + 1]) {
                if(idx == null) {
                    idx = i;
                }else {
                    return false;
                }
            }
        }
        if(idx == null || idx == 0 || idx == nums.length - 2) {
            return true;
        }
        if(nums[idx - 1] <= nums[idx + 1]
                || nums[idx] <= nums[idx + 2]) {
            return true;
        }
        return false;
    }

}
