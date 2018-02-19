package leetcode.Medium;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/unique-binary-search-trees
 */
public class UniqueBinarySearchTrees {

    public static int numTrees(int n) {
        if(n < 0) {
            return 0;
        }
        int[] dp = new int[n + 1];
        return count(dp, n);
    }

    private static int count(int[] dp, int n) {
        if(n == 0) {
            return 1;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        for (int i = 1; i <= n; i++) {
            dp[n] += count(dp, i - 1) * count(dp, n - i);
        }
        return dp[n];
    }

}
