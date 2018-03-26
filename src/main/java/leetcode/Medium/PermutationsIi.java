package leetcode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/permutations-ii
 */
public class PermutationsIi {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        permuteUnique(list, new ArrayList<>(), nums, visited, 0);
        return list;
    }

    private void permuteUnique(List<List<Integer>> list, List<Integer> sub, int[] nums, boolean[] visited, int idx) {
        if(idx == nums.length) {
            list.add(new ArrayList<>(sub));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(visited[i] || i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {//!visited[i - 1] --> if first 1 is used, then second 1 not need to use
                continue;
            }
            visited[i] = true;
            sub.add(nums[i]);
            permuteUnique(list, sub, nums, visited,idx + 1);
            visited[i] = false;
            sub.remove(sub.size() - 1);
        }
    }

}
