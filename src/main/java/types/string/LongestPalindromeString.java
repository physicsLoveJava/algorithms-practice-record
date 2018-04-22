package types.string;

import util.PrintUtils;

public class LongestPalindromeString {

    public int find(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i == j) {
                    dp[i][j] = 1;
                }
            }
        }
        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i < j) {
                    if(s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    }else {
                        dp[i][j] = Math.max(
                                dp[i + 1][j - 1],
                                Math.max(
                                        dp[i + 1][j],
                                        dp[i][j - 1]
                                )
                        );
                    }
                }
            }
        }
        PrintUtils.printMatrix(dp, 2);
        return dp[0][s.length() - 1];
    }

}
