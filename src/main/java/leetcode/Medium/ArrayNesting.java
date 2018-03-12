package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/array-nesting
 */
public class ArrayNesting {

    public int arrayNesting(int[] nums) {

        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if(arr[i] != 0) {
                continue;
            }
            int cur = 0;
            int idx = i;
            int tmp = arr[idx];
            while(tmp == 0) {
                arr[idx] = ++cur;
                idx = nums[idx];
                tmp = arr[idx];
            }
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
