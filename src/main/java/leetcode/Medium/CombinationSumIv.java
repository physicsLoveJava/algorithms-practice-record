package leetcode.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem Url: https://leetcode.com/problems/combination-sum-iv
 */
public class CombinationSumIv {

    public int combinationSum4(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<>();
        compute(nums, target, set, new ArrayList<>());
        return set.size();
    }

    private void compute(int[] nums, int target, Set<List<Integer>> set, List<Integer> sub) {
        if(target == 0) {
            set.add(new ArrayList<>(sub));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(target - nums[i] >= 0) {
                ArrayList<Integer> subList = new ArrayList<>(sub);
                subList.add(nums[i]);
                compute(nums, target - nums[i], set, subList);
            }
        }
    }

}
