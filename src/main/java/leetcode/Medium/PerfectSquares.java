package leetcode.Medium;

import org.apache.commons.lang3.ArrayUtils;
import util.PrintUtils;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/perfect-squares
 */
public class PerfectSquares {

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        int compute = compute(dp, n);
        return compute;
    }

    private int compute(int[] dp, int n) {
        if(n == 0) {
            return 0;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        if(isSquare(n)) {
            return dp[n] = 1;
        }
        int x = findLeastSquare(n);
        int min = Integer.MAX_VALUE;
        for (int i = x; i >= 1 ; i--) {
            int tmp = 1 + compute(dp, n - i * i);
            if(min > tmp) {
                min = tmp;
            }
        }
        return dp[n] = min;
    }

    private int findLeastSquare(int n) {
        for (int i = (int) Math.sqrt(n); i >= 1; i--) {
            if(i * i <= n) {
                return i;
            }
        }
        return 0;
    }

    private boolean isSquare(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

}
