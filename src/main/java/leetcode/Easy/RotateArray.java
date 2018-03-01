package leetcode.Easy;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/rotate-array
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {

        if(nums == null || nums.length == 0 || k < 1) {
            return;
        }
        k = k % nums.length;
        int count = 0;
        for (int i = 0; count < nums.length; i++) {
            int j = i;
            int tmp = nums[j];
            do {
                int next = (j + k) % nums.length;
                int aTmp = nums[next];
                nums[next] = tmp;
                j = next;
                tmp = aTmp;
                count++;
            }while(i != j);
        }
    }

}
