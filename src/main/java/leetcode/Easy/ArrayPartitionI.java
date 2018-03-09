package leetcode.Easy;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/array-partition-i
 */
public class ArrayPartitionI {

    public int arrayPairSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }

}
