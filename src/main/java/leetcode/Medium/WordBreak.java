package leetcode.Medium;

import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/word-break
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[][] dp = new Boolean[s.length()][s.length()];
        return wordBreak(s, 0, s.length() - 1, dp, wordDict);
    }

    private boolean wordBreak(String t, int s, int e, Boolean[][] dp, List<String> dict) {
        if(s > e) {
            return false;
        }
        if(dp[s][e] != null) {
            return dp[s][e];
        }
        if(s == e) {
            return dp[s][e] = dict.contains(t.substring(s, e + 1));
        }
        if(dict.contains(t.substring(s, e + 1))) {
            return dp[s][e] = true;
        }
        for (int i = s; i < e; i++) {
            if(wordBreak(t, s, i, dp, dict) && wordBreak(t, i + 1, e, dp, dict)) {
                return dp[s][e] = true;
            }
        }
        return dp[s][e] = false;
    }

}
