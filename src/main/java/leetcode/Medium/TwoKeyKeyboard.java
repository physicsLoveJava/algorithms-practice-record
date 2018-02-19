package leetcode.Medium;

/**
 * https://leetcode.com/problems/2-keys-keyboard/description/
 */
public class TwoKeyKeyboard {

    static int[] dp;

    public static int minSteps(int n) {
        if(n < 1) {
            throw new IllegalArgumentException();
        }
        if(n == 1) {
            return 0;
        }
        dp = new int[1001];
        return find(n);
    }

    private static int find(int n) {
        if(dp[n] != 0) {
            return dp[n];
        }
        int div = findMaxDivisor(n);
        if(div == 1) {
            dp[n] = n;
            return n;
        }else {
            int rest = n / div;
            dp[n] = find(div) + rest;
            return dp[n];
        }
    }

    private static int findMaxDivisor(int n) {
        int max = 1;
        for (int i = 1; i <= n / 2; i++) {
            if((n % i) == 0) {
                max = i;
            }
        }
        System.out.println(n + " max divisor is :" + max);
        return max;
    }

}
