package leetcode.Medium;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/find-the-duplicate-number
 */
public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        int n = nums.length - 1;
        int left = 1, right = n;
        while(left < right){
            int middle = (left + right) / 2;
            int lt = 0, rt = 0, mt = 0;
            for(int i: nums){
                if(i == middle) mt++;
                if(i >= left && i < middle) lt ++;
                if(i > middle && i <= right) rt ++;
            }
            if(mt > 1) return middle;
            if(rt > lt){
                left = middle + 1;
            }else{
                right = middle - 1;
            }

        }
        return left;
    }

}
