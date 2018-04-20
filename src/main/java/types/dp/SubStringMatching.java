package types.dp;

import java.util.ArrayList;
import java.util.List;

public class SubStringMatching {

    /**
     * @param s 单词
     * @param t 长文本
     * @param k 相似数
     * @return 候选单词
     */
    public List<String> subStringMatching(String s, String t, int k) {
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= n; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }else {
                    dp[i][j] = 1 + Math.min(
                            dp[i - 1][j],
                            dp[i][j - 1]
                    );
                }
            }
        }
        List<String> rs = new ArrayList<>();
        constructCandidate(rs, dp, s, t, m, n, k);
        return rs;
    }

    private void constructCandidate(List<String> rs, int[][] dp, String s, String t, int m, int n, int k) {
        for (int i = k; i < t.length(); i++) {
            if(dp[m][i] <= k) {
                String candidate = findCandidate(dp, s, t, m, i, "");
                if(candidate.length() > s.length() - k && candidate.length() < s.length() + k) {
                    rs.add(candidate);
                }
            }
        }
    }

    private String findCandidate(int[][] dp, String s, String t, int m, int i, String ca) {
        if(m == 0 || i == 0) {
            return t.charAt(i) + ca;
        }
        if(dp[m][i] == dp[m - 1][i] - 1) {
            return findCandidate(dp, s, t, m - 1, i, ca);
        }
        if(dp[m][i] == dp[m][i - 1] - 1) {
            return findCandidate(dp, s, t, m, i - 1, t.charAt(i) + ca);
        }
        if(dp[m][i] == dp[m - 1][i - 1]) {
            return findCandidate(dp, s, t, m - 1, i - 1, t.charAt(i) + ca);
        }
        return ca;
    }

}
