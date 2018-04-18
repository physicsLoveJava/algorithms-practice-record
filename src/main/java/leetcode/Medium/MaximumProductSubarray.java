package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/maximum-product-subarray
 */
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int m = nums[0];
        int max = m, min = m;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < 0) {
                int tmp = max;
                max = min;
                min = tmp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            m = Math.max(m, max);
        }
        return m;
    }

}
