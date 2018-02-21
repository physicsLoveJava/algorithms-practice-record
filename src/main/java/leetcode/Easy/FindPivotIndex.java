package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/find-pivot-index
 */
public class FindPivotIndex {

    public static int pivotIndex(int[] nums) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int tSum = sum - nums[i];
            if(tSum == leftSum * 2) {
                return i;
            }else {
                leftSum += nums[i];
            }
        }
        return -1;
    }

}
