package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/reverse-words-in-a-string
 */
public class ReverseWordsInAString {

    public String reverseString(String s) {
        if(s == null || s.length() == 0) {
            return s;
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char ch = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = ch;
        }
        return String.valueOf(chars);
    }

}
