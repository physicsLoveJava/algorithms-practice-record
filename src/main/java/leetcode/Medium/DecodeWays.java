package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/decode-ways
 */
public class DecodeWays {

    static int[] dp;

    public static int numDecodings(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        if(s.startsWith("0")) {
            return 0;
        }
        for (int i = 0; i <= 9; i++) {
            if((i != 1 && i != 2) && s.contains(i + "0")) {
                return 0;
            }
        }
        dp = new int[s.length()];
        char[] chars = s.toCharArray();
        return find(chars, s.length() - 1);
    }

    private static int find(char[] chars, int end) {
        if(end < 0) {
            return 1;
        }
        if(dp[end] != 0) {
            return dp[end];
        }
        if(end == 0) {
            dp[end] = 1;
            return 1;
        }
        if((chars[end - 1] == '2' && (chars[end] >= '1' && chars[end] <= '6'))
                || (chars[end - 1] == '1' && chars[end] != '0')) {
            dp[end] = find(chars, end - 1) + find(chars, end - 2);
        }else {
            if(chars[end] == '0') {
                dp[end] = find(chars, end - 2);
            }else {
                dp[end] = find(chars, end - 1);
            }
        }
        return dp[end];
    }
}
