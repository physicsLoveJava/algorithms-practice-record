package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/count-numbers-with-unique-digits
 */
public class CountNumbersWithUniqueDigits {

    public int countNumbersWithUniqueDigits(int n) {
        if(n < 0) {
            return 0;
        }
        long[] dp = new long[n + 1];
        return (int) compute(dp, n);
    }

    private long compute(long[] dp, int n) {
        if(n < 1) {
            return 1;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        if(n == 1) {
            dp[1] = 10;
        }else {
            dp[n] = compute(dp, n - 1) + count(n);
        }
        return dp[n];
    }

    private long count(int n) {
        long x = 9;
        for (int i = 0; i < n - 1; i++) {
            x *= 9 - i;
        }
        return x;
    }

}
