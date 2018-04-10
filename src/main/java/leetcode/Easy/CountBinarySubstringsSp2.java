package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/count-binary-substrings
 */
public class CountBinarySubstringsSp2 {

    public int countBinarySubstrings(String s) {
        if(s == null || s.length() < 2) {
            return 0;
        }
        int sum = 0, prev = 0, cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) != s.charAt(i)) {
                sum += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            }else {
                cur ++;
            }
        }
        return sum + Math.min(prev, cur);
    }

}
