package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/is-subsequence
 */
public class IsSubsequenceSp1 {

    public boolean isSubsequence(String s, String t) {
        int idx = -1;
        for (int i = 0; i < s.length(); i++) {
            idx = t.indexOf(s.charAt(i), idx + 1);
            if(idx == -1) {
                return false;
            }
        }
        return true;
    }

}
