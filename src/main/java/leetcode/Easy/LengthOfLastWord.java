package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/length-of-last-word
 */
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        int j = s.length() - 1;
        while(j >= 0 && s.charAt(j) == ' ') {
            j--;
        }
        if(j < 0) {
            return 0;
        }
        int i = j;
        while(i >= 0 && s.charAt(i) != ' ') {
            i--;
        }
        return j - i;
    }

}
