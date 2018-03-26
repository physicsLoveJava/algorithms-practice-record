package leetcode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/subsets-ii
 */
public class SubsetsIi {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        subset(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void subset(List<List<Integer>> list, List<Integer> sub, int[] nums, int idx) {
        list.add(new ArrayList<>(sub));
        for (int i = idx; i < nums.length; i++) {
            if(i > idx && nums[i] == nums[i - 1]) {
                continue;
            }
            sub.add(nums[i]);
            subset(list, sub, nums, i + 1);
            sub.remove(sub.size() - 1);
        }
    }

}
