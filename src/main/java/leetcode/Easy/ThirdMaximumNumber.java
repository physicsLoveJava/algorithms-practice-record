package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/third-maximum-number
 */
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        Integer max1 = null;
        for (int i = 0; i < nums.length; i++) {
            if(max1 == null) {
                if(nums[i] != max) {
                    max1 = nums[i];
                }
            }else {
                if(max1 < max && nums[i] > max1 && nums[i] != max) {
                    max1 = nums[i];
                }
            }
        }
        Integer max2 = null;
        for (int i = 0; i < nums.length; i++) {
            if(max2 == null) {
                if(max1 != null && nums[i] != max && nums[i] != max1) {
                    max2 = nums[i];
                }
            }else {
                if(max2 < max && nums[i] > max2 && nums[i] != max && nums[i] != max1) {
                    max2 = nums[i];
                }
            }
        }
        System.out.println(max);
        System.out.println(max1);
        System.out.println(max2);
        return max2 == null ? max : max2;
    }

}
