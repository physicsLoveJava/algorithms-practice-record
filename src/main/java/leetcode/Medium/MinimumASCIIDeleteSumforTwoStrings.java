package leetcode.Medium;

import util.PrintUtils;

/**
 * https://leetcode.com/problems/minimum-ascii-delete-sum-for-two-strings/description/
 */
public class MinimumASCIIDeleteSumforTwoStrings {

    public static int minimumDeleteSum(String s1, String s2) {
        char[] mChars = s1.toCharArray();
        char[] nChars = s2.toCharArray();
        int m = s1.length() + 1;
        int n = s2.length() + 1;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = computeCost(mChars, i);
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = computeCost(nChars, i);
        }
        for (int j = 1; j < n; j++) {
            for (int i = 1; i < m; i++) {
                if(mChars[i - 1] == nChars[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1];
                }else {
                    dp[i][j] = Math.min(
                            dp[i - 1][j] + mChars[i - 1],
                            dp[i][j - 1] + nChars[j - 1]
                    );
                }
            }
        }
        PrintUtils.printMatrix(dp);
        return dp[m - 1][n - 1];
    }

    private static int computeCost(char[] mChars, int i) {
        int cost = 0;
        for (int j = 0; j < i; j++) {
            cost += mChars[j];
        }
        return cost;
    }

}
