package leetcode.hard;

/**
 * https://leetcode.com/problems/count-different-palindromic-subsequences/description/
 * @return
 */
public class CountDifferentPalindromicSubsequences {

    public static int countPalindromicSubsequences(String str) {
        if(str == null || str.length() < 1) {
            return 0;
        }
        int len = str.length();
        int mod = 1000000007;
        int[][][] dp = new int[4][len][len];
        for (int i = len - 1; i > -1 ; i--) {
            for (int j = i; j < len; j++) {
                for (int k = 0; k < 4; k++) {
                    if(j == i) {
                        if(str.charAt(i) == 'a' + k) {
                            dp[k][i][j] = 1;
                        }
                    }else {
                        if(str.charAt(i) != 'a' + k) {
                            dp[k][i][j] = dp[k][i+1][j];
                        }else if(str.charAt(j) != 'a' + k) {
                            dp[k][i][j] = dp[k][i][j-1];
                        }else {
                            dp[k][i][j] = 2;
                            for (int l = 0; l < 4; l++) {
                                dp[k][i][j] += dp[l][i+1][j-1];
                                dp[k][i][j] %= mod;
                            }
                        }
                    }
                }
            }
        }
        int val = 0;
        for (int i = 0; i < 4; i++) {
            val += dp[i][0][len-1];
            val %= mod;
        }
        return val;
    }

}
