package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/maximal-square
 */
public class MaximalSquare {

    public int maximalSquare(char[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int min = Math.min(m, n);
        int[][][] dp = new int[m][n][min + 1];
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j][1] = matrix[i][j] == '1' ? 1 : 0;
                ans = Math.max(ans, dp[i][j][1]);
            }
        }
        for (int i = 2; i <= min; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    if(j + i - 1 < m && k + i - 1 < n && dp[j][k][i - 1] == Math.pow(i - 1, 2)) {
                        dp[j][k][i] += dp[j][k][i - 1];
                        for (int l = 0; l < i; l++) {
                            dp[j][k][i] += dp[j + l][k + i - 1][1];
                            dp[j][k][i] += dp[j + i - 1][k + l][1];
                        }
                        dp[j][k][i] -= dp[j + i - 1][k + i - 1][1];
                        if(dp[j][k][i] == Math.pow(i, 2)) {
                            ans = Math.max(ans, dp[j][k][i]);
                        }
                    }
                }
            }
        }
        return ans;
    }

}
