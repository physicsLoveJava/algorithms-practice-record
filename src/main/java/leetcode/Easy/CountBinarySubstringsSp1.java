package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/count-binary-substrings
 */
public class CountBinarySubstringsSp1 {

    public int countBinarySubstrings(String s) {
        if(s == null || s.length() < 2) {
            return 0;
        }
        int[] group = new int[s.length()];
        int t = 0;
        group[t] = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i - 1) != s.charAt(i)) {
                group[++t] = 1;
            }else {
                group[t] += 1;
            }
        }
        int sum = 0;
        for (int i = 1; i < group.length; i++) {
            sum += Math.min(group[i - 1], group[i]);
        }
        return sum;
    }

}
