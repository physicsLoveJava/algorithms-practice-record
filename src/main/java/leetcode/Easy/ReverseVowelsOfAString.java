package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/reverse-vowels-of-a-string
 */
public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        if(s == null) {
            return null;
        }
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while(i < j) {
            while(i < j && !isVowel(chars[i])) {
                i++;
            }
            while(i < j && !isVowel(chars[j])) {
                j--;
            }
            if(i < j) {
                swap(chars, i, j);
                i++; j--;
            }
        }
        return new String(chars);
    }

    private void swap(char[] chars, int i, int j) {
        char tmp = chars[i];
        chars[i] = chars[j];
        chars[j] = tmp;
    }

    private boolean isVowel(char aChar) {
        return
                   aChar == 'a'
                || aChar == 'e'
                || aChar == 'o'
                || aChar == 'u'
                || aChar == 'i'
                || aChar == 'A'
                || aChar == 'E'
                || aChar == 'O'
                || aChar == 'U'
                || aChar == 'I'
            ;
    }

}
