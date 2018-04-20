package types.dp;

public class BinomialCoefficientRecursion {

    public int combination(int n, int k) {
        int[][] dp = new int[n + 1][n + 1];
        return combination(dp, n, k);
    }

    private int combination(int[][] dp, int n, int k) {
        if(k == 0 || n == k) {
            return dp[n][k] = 1;
        }
        return dp[n][k] != 0 ?
                dp[n][k] :
                combination(dp, n - 1, k - 1) + combination(dp, n - 1, k);
    }

}
