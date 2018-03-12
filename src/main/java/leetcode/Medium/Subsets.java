package leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/subsets
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> rs = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            generateSubSets(nums, new ArrayList<>(), rs, i, 0);
        }

        return rs;
    }

    private void generateSubSets(int[] nums,List<Integer> sub, List<List<Integer>> rs, int size, int idx) {
        if(size == 0) {
            rs.add(new ArrayList<>(sub));
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            sub.add(nums[i]);
            generateSubSets(nums, sub, rs, size - 1, i + 1);
            sub.remove(Integer.valueOf(nums[i]));
        }
    }

}
