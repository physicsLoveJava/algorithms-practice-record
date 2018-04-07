package leetcode.Medium;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/number-of-longest-increasing-subsequence
 */
public class NumberOfLongestIncreasingSubsequence {

    public static int findNumberOfLIS(int[] array) {
        if(array.length <= 1) {
            return array.length;
        }
        int[] length = new int[array.length];
        int[] count = new int[array.length];
        Arrays.fill(count, 1);
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < j; i++) {
                if(array[i] < array[j]) {
                    if(length[i] >= length[j]) {
                        length[j] = length[i] + 1;
                        count[j] = count[i];
                    }else if(length[i] + 1 == length[j]) {
                        count[j] += count[i];
                    }
                }
            }
        }
        int max = 0;
        int rs = 0;
        for (int len : length) {
            max = Math.max(max, len);
        }
        for (int i = 0; i < array.length; i++) {
            if(length[i] == max) {
                rs += count[i];
            }
        }
        return rs;
    }

}
