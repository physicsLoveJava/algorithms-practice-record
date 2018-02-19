package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/palindromic-substrings
 */
public class PalindromicSubstrings {

    public static int countSubstrings(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if(isPalindromicSubstring(chars, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isPalindromicSubstring(char[] chars, int i, int j) {
        while(i <= j) {
            if(chars[i] - chars[j] != 0) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
