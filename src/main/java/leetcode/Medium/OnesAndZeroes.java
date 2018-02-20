package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/ones-and-zeroes
 */
public class OnesAndZeroes {

    static int[][] dp;

    public static int findMaxForm(String[] strs, int m, int n) {
        if(strs == null || strs.length == 0) {
            return 0;
        }
        dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int z = findNum(str, '0');
            int o = findNum(str, '1');
            for (int i = m; i >= z; i--) {
                for (int j = n; j >= o ; j--) {
                    if(i - z >= 0 && j - o >= 0) {
                        dp[i][j] = Math.max(
                                dp[i - z][j - o] + 1,
                                dp[i][j]
                        );
                    }
                }
            }
        }
        return dp[m][n];
    }

    private static int findNum(String str, char ch) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if(c == ch) {
                count++;
            }
        }
        return count;
    }

}
