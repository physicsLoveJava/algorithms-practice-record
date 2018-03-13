package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/is-subsequence
 */
public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        return isSubsequence(s, 0, s.length() - 1, t, 0, t.length() - 1);
    }

    private boolean isSubsequence(String s, int ss, int se, String t, int ts, int te) {
        if(ss > se || ts > te) {
            return false;
        }
        if(s.charAt(se) == t.charAt(te)) {
            if(se == ss) {
                return true;
            }else {
                return isSubsequence(s, ss, se - 1, t, ts, te - 1);
            }
        }else {
            return isSubsequence(s, ss, se, t, ts, te - 1);
        }
    }

}
