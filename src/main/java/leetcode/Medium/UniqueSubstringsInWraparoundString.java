package leetcode.Medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/unique-substrings-in-wraparound-string
 */
public class UniqueSubstringsInWraparoundString {

    public static int findSubstringInWraproundString(String p) {
        if (p == null || p.length() == 0) {
            return 0;
        }
        if(p.length() == 1) {
            return 1;
        }
        char[] chars = p.toCharArray();
        int[] dp = new int[26];
        int count = 0;
        for (int i = 0; i <= chars.length - 1; i++) {
            if(i> 0 && (chars[i - 1] - chars[i] == -1 || chars[i - 1] - chars[i] == 25)) {
                count++;
            }else {
                count = 1;
            }
            int idx = chars[i] - 'a';
            dp[idx] = Math.max(dp[idx], count);
        }
        int sum = 0;
        for (int i = 0; i < dp.length; i++) {
            sum += dp[i];
        }
        return sum;
    }

}
