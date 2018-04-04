package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/find-the-difference
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            x ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i++) {
            x ^= t.charAt(i);
        }
        return (char) x;
    }

}
