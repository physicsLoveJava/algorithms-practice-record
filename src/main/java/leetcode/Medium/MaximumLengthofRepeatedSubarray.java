package leetcode.Medium;

import util.PrintUtils;

/**
 * https://leetcode.com/problems/maximum-length-of-repeated-subarray/description/
 */
public class MaximumLengthofRepeatedSubarray {

    /**
     * solution
     *
     *      1 2 3 2 1
     *    3 0 0 1 0 0
     *    2 0 1 0 2 0
     *    1 1 0 0 0 3
     *    4 0 0 0 0 0
     *    7 0 0 0 0 0
     *
     * @param a
     * @param b
     * @return
     */
    public static int findLength(int[] a, int[] b) {
        if(a == null || b == null) {
            return 0;
        }
        int[][] dp = new int[a.length][b.length];
        int tmp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] != b[j]) {
                    dp[i][j] = 0;
                }else {
                    if(i == 0 || j == 0) {
                        dp[i][j] = 1;
                    }else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                }
                if(tmp < dp[i][j]) {
                    tmp = dp[i][j];
                }
            }
        }
        return tmp;
    }

}
