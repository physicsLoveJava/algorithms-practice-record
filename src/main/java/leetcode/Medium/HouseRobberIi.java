package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/house-robber-ii
 */
public class HouseRobberIi {

    public int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    private int rob(int[] nums, int start, int end) {
        int r = 0, ur = 0;
        for (int i = start; i <= end; i++) {
            int pr = r, pur = ur;
            r = ur + nums[i];
            ur = Math.max(pur, pr);
        }
        return Math.max(r, ur);
    }

}
