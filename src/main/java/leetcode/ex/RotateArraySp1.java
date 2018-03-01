package leetcode.ex;

/**
 * https://leetcode.com/problems/rotate-array/
 */
public class RotateArraySp1 {

    public void rotate(int[] nums, int k) {

        if (nums == null || nums.length == 0 || k < 1) {
            return;
        }
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        for (int i = start; i <= (start + end) / 2 ; i++) {
            int num = nums[i];
            nums[i] = nums[end - i + start];
            nums[end - i + start] = num;
        }
    }

}
