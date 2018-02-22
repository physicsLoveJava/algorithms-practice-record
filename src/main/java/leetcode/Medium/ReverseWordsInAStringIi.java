package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/reverse-words-in-a-string-ii
 */
public class ReverseWordsInAStringIi {

    public String reverseStr(String s, int k) {
        if(s == null || s.length() == 0 || k < 1) {
            return s;
        }
        int t = s.length() / (2 * k);
        char[] chars = s.toCharArray();
        for (int i = 0; i <= t; i++) {
            reverse(chars, (2*k) * i, (2*k) * i + (k - 1));
        }
        return String.valueOf(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        if(start > chars.length - 1) {
            return;
        }
        if(end > chars.length - 1) {
            end = chars.length - 1;
        }
        System.out.printf("range (%d, %d)\n", start, end);
        for (int i = start; i <= (start + end) / 2; i++) {
            System.out.printf("b -> %c %c\n", chars[i], chars[end - i + start]);
            char ch = chars[i];
            chars[i] = chars[end - i + start];
            chars[end - i + start] = ch;
            System.out.printf("a -> %c %c\n", chars[i], chars[end - i + start]);
        }
    }

}
