package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/reverse-words-in-a-string-iii
 */
public class ReverseWordsInAStringIii {

    public String reverseWords(String s) {
        if(s == null || s.length() == 0) {
            return s;
        }
        String[] parts = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            parts[i] = reverse(parts[i]);
            sb.append(parts[i]).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

    private String reverse(String part) {
        char[] chars = part.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char ch = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = ch;
        }
        return String.valueOf(chars);
    }

}
