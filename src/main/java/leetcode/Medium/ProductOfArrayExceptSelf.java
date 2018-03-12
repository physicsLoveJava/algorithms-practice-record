package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/product-of-array-except-self
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int[] rs = new int[nums.length];
        rs[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            rs[i] = rs[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            rs[i] *= right;
            right *= nums[i];
        }

        return rs;
    }

}
