package leetcode.Medium;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/out-of-boundary-paths
 */
public class OutOfBoundaryPaths {

    static int mod = (int) (1e9 + 7);

    public int findPaths(int m, int n, int N, int i, int j) {
        long[][][] dp = new long[m][n][N + 1];
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                Arrays.fill(dp[k][l], -1);
            }
        }
        return compute(dp, m, n, N, i, j);
    }

    private int compute(long[][][] dp, int m, int n, int N, int i, int j) {
        if(i < 0 || i > m - 1 || j < 0 || j > n - 1) {
            return 1;
        }
        if(N <= 0) {
            return 0;
        }
        if(dp[i][j][N] >= 0) {
            return (int) dp[i][j][N];
        }
        int count = 0;
        count = (count + compute(dp, m, n, N - 1, i + 1, j)) % mod;
        count = (count + compute(dp, m, n, N - 1, i - 1, j)) % mod;
        count = (count + compute(dp, m, n, N - 1, i, j + 1)) % mod;
        count = (count + compute(dp, m, n, N - 1, i, j - 1)) % mod;
        return (int) (dp[i][j][N] = count);
    }

}
