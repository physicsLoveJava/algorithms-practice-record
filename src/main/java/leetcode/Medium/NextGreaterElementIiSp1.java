package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/next-greater-element-ii
 */
public class NextGreaterElementIiSp1 {

    public int[] nextGreaterElements(int[] nums) {
        int[] rs = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            boolean found = false;
            for (int j = 1; j < nums.length; j++) {
                if(nums[(i + j) % nums.length] > nums[i]) {
                    rs[i] = nums[(i + j) % nums.length];
                    found = true;
                    break;
                }
            }
            if(!found) {
                rs[i] = -1;
            }
        }
        return rs;
    }
}
