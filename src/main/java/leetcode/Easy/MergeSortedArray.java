package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/merge-sorted-array
 */
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            int toInsert = nums2[i];
            int k = m + i - 1;
            while(k >= -1) {
                if(k >= 0 && nums1[k] > toInsert) {
                    nums1[k + 1] = nums1[k];
                }else {
                    nums1[k + 1] = toInsert;
                    break;
                }
                k--;
            }
        }
    }

}
