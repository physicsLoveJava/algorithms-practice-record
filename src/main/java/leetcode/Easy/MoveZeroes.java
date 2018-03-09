package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/move-zeroes
 */
public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1) {
            return;
        }
        int count = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] != 0) {
                continue;
            }
            if(i == nums.length - 1) {
                continue;
            }
            System.arraycopy(nums, i + 1, nums, i, nums.length - count - i - 1);
            nums[nums.length - count - 1] = 0;
        }
    }

}
