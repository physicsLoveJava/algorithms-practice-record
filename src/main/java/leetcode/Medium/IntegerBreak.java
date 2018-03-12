package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/integer-break
 */
public class IntegerBreak {

    public int integerBreak(int n) {
        if(n < 2 || n > 58) {
            return -1;
        }
        int[] dp = new int[n + 1];
        return maxProduct(dp, n);
    }

    private int maxProduct(int[] dp, int n) {
        if(dp[n] != 0) {
            return dp[n];
        }
        int max = 0;
        for (int i = 1; i <= n / 2; i++) {
            int mp = Math.max(maxProduct(dp, n - i), n - i) * i;
            if(mp > max) {
                max = mp;
            }
        }
        dp[n] = max;
        return dp[n];
    }

}
