package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/wiggle-subsequence
 */
public class WiggleSubsequence {

    public int wiggleMaxLength(int[] nums) {

        int max = 0;
        int inc = 0;
        int last = 0;
        for (int i = 0; i < nums.length; i++) {
            if(max == 0) {
                max = 1;
                last = nums[i];
            }else {
                if(inc == 0) {
                    inc = (int) Math.signum(nums[i] - last);
                    if(inc != 0) {
                        max++;
                    }
                    last = nums[i];
                }else if((inc > 0 && nums[i] < last) || (inc < 0 && nums[i] > last)) {
                    inc = (int) Math.signum(nums[i] - last);
                    max++;
                    last = nums[i];
                }else {
                    if(inc > 0) {
                        last = Math.max(last, nums[i]);
                    }
                    if(inc < 0) {
                        last = Math.min(last, nums[i]);
                    }
                }
            }
        }

        return max;
    }

}
