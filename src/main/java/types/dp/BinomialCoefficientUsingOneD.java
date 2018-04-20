package types.dp;

public class BinomialCoefficientUsingOneD {

    public int combination(int n, int k) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }
        return dp[k];
    }

}
