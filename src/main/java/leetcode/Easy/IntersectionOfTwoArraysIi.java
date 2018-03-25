package leetcode.Easy;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/intersection-of-two-arrays-ii
 */
public class IntersectionOfTwoArraysIi {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        int[] rs = new int[Math.max(nums1.length, nums2.length)];
        int count = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] == nums2[j]) {
                rs[count++] = nums1[i];
                i+=1;j+=1;
            }else if(nums1[i] < nums2[j]) {
                i++;
            }else {
                j++;
            }
        }

        int[] result = new int[count];
        System.arraycopy(rs, 0, result, 0, count);
        return result;
    }

}
