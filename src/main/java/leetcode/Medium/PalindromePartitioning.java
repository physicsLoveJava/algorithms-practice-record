package leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/palindrome-partitioning
 */
public class PalindromePartitioning {

    public List<List<String>> partition(String s) {
        List<List<String>> rs = new ArrayList<>();
        dfs(rs, new ArrayList<>(), s, 0, "");
        return rs;
    }

    private void dfs(List<List<String>> rs, List<String> list, String s, int idx, String cur) {
        if(s == null) {
            return;
        }
        if(idx == s.length()) {
            if(cur.equals("")) {
                rs.add(new ArrayList<>(list));
            }
            return;
        }
        String possible = cur + s.charAt(idx);
        if(isPalindrome(possible)) {
            list.add(possible);
            dfs(rs, list, s, idx + 1, "");
            list.remove(list.size() - 1);
            dfs(rs, list, s, idx + 1, possible);
        }else {
            dfs(rs, list, s, idx + 1, possible);
        }
    }

    private boolean isPalindrome(String cur) {
        int s = 0, e = cur.length() - 1;
        while(s < e) {
            if(cur.charAt(s) == cur.charAt(e)) {
                s++;e--;
            }else {
                return false;
            }
        }
        return true;
    }

}
