package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/unique-paths
 */
public class UniquePaths {

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        return compute(dp, m, n);
    }

    private int compute(int[][] dp, int m, int n) {
        if(m < 1 || n < 1) {
            return 0;
        }
        if(m == 1 && n == 1) {
            return 1;
        }
        if(dp[m][n] != 0) {
            return dp[m][n];
        }
        return dp[m][n] = compute(dp, m - 1, n) + compute(dp, m, n - 1);
    }

}
