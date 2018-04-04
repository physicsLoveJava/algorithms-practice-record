package leetcode.Easy;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/valid-anagram
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        return String.valueOf(sChars).equals(String.valueOf(tChars));
    }

}
