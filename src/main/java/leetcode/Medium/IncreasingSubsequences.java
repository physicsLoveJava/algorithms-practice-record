package leetcode.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem Url: https://leetcode.com/problems/increasing-subsequences
 */
public class IncreasingSubsequences {

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        dfs(rs, nums, new ArrayList<>(), 0);
        return rs;
    }

    private void dfs(List<List<Integer>> rs, int[] nums, List<Integer> sub, int idx) {
        if(sub.size() > 1) {
            rs.add(new ArrayList<>(sub));
        }
        Set<Integer> set = new HashSet<>();
        for (int i = idx; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                continue;
            }
            if(sub.isEmpty() || sub.get(sub.size() - 1) <= nums[i]) {
                set.add(nums[i]);
                sub.add(nums[i]);
                dfs(rs, nums, sub, i + 1);
                sub.remove(sub.size() - 1);
            }
        }
    }

}
