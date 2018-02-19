package leetcode.Medium;

import util.PrintUtils;

/**
 * Problem Url: https://leetcode.com/problems/longest-palindromic-substring
 */
public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return "";
        }
        if(s.length() == 1) {
            return s;
        }
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                dp[i][j] = true;
            }
        }
        int maxi = 0, maxj = 0;
        for (int i = 1; i < s.length(); i++) {
            for (int j = 0; j < s.length() - i; j++) {
                int k = j + i;
                if(s.charAt(j) == s.charAt(k)) {
                    dp[j][k] = dp[j + 1][k - 1];
                }else {
                    dp[j][k] = false;
                }
                if(dp[j][k]) {
                    maxi = j;
                    maxj = k;
                }
            }
        }
        System.out.println();
        PrintUtils.printMatrix(dp);
        System.out.println(maxi + ":" + maxj);
        return retrieveSubString(dp, s, maxi, maxj);
    }

    private static String retrieveSubString(boolean[][] dp, String s, int start, int end) {
        if(start > end) {
            return "";
        }
        StringBuilder l = new StringBuilder();
        StringBuilder r = new StringBuilder();
        String mid = "";
        while(start <= end) {
            if(start == end) {
                mid = String.valueOf(s.charAt(start));
            }else {
                l.append(s.charAt(start));
                r.insert(0, s.charAt(start));
            }
            start++;
            end--;
        }
        return l.toString() + mid + r.toString();
    }

}
