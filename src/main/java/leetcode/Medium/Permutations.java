package leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/permutations
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rs = new ArrayList<>();
        permute(rs, nums, 0);
        return rs;
    }

    private void permute(List<List<Integer>> rs, int[] nums, int idx) {
        if(idx == nums.length - 1) {
            rs.add(toList(nums));
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(nums, i, idx);
            permute(rs, nums, idx + 1);
            swap(nums, i, idx);
        }
    }

    private void swap(int[] nums, int i, int idx) {
        int tmp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = tmp;
    }

    private List<Integer> toList(int[] nums) {
        List<Integer> list = new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        return list;
    }

}
