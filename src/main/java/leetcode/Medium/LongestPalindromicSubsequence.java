package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/longest-palindromic-subsequence
 */
public class LongestPalindromicSubsequence {

    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()][s.length()];
        return compute(s, 0, s.length() - 1, dp);
    }

    private int compute(String s, int left, int right, int[][] dp) {
        if(dp[left][right] != 0) {
            return dp[left][right];
        }
        if(left > right) {
            return 0;
        }
        if(left == right) {
            return dp[left][right] = 1;
        }
        int tmp = 0;
        if(s.charAt(left) == s.charAt(right)) {
            tmp = 2 + compute(s, left + 1, right - 1, dp);
        }else {
            tmp = Math.max(
                    compute(s, left + 1, right, dp),
                    compute(s, left, right - 1, dp));
        }
        return dp[left][right] = tmp;
    }

}
