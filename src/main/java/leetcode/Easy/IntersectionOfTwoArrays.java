package leetcode.Easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem Url: https://leetcode.com/problems/intersection-of-two-arrays
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if(set1.contains(nums2[i])) {
                set2.add(nums2[i]);
            }
        }
        int[] rs = new int[set2.size()];
        int idx = 0;
        for (Integer key : set2) {
            rs[idx++] = key;
        }
        return rs;
    }

}
