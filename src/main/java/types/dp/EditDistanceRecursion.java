package types.dp;

/**
 * match --> dp(i, j) --> dp(i - 1, j - 1);
 * insert --> dp(i, j) --> dp(i, j - 1) + insertCost;
 * delete --> dp(i, j) --> dp(i - 1, j) + deletionCost;
 * replace --> dp(i, j) --> dp(i - 1, j - 1) + replaceCost;
 *
 * find the minimum cost
 */
public class EditDistanceRecursion {

    public int editDistance(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = i;
        }
        return editDistance(dp, s, t, m, n);
    }

    private int editDistance(int[][] dp, String s, String t, int m, int n) {
        if(m == 0) {
            return dp[m][n] = n;
        }
        if(n == 0) {
            return dp[m][n] = m;
        }
        if(dp[m][n] != 0) {
            return dp[m][n];
        }
        if(s.charAt(m - 1) == t.charAt(n - 1)) {
            return dp[m][n] = editDistance(dp, s, t, m - 1, n - 1);
        }
        return dp[m][n] = 1 +
                Math.min(
                        Math.min(
                                editDistance(dp, s, t, m - 1, n),
                                editDistance(dp, s, t, m, n - 1)
                                ),
                        editDistance(dp, s, t, m - 1, n - 1)
                );
    }

}
