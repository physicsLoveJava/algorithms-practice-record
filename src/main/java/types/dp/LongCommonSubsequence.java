package types.dp;

import util.PrintUtils;

public class LongCommonSubsequence {

    public static int find(String a, String b) {
        if(a == null || b == null) {
            return 0;
        }
        int m = a.length() + 1;
        int n = b.length() + 1;
        char[] mChars = a.toCharArray();
        char[] nChars = b.toCharArray();
        int[][] dp = new int[m][n];
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(mChars[i - 1] == nChars[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }else {
                    dp[i][j] = Math.max(
                            dp[i][j - 1],
                            dp[i - 1][j]
                    );
                }
            }
        }
        PrintUtils.printMatrix(dp);
        return dp[m - 1][n - 1];
    }

}
