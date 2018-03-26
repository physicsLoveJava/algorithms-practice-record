package leetcode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/combination-sum-ii
 */
public class CombinationSumIi {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        combination(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void combination(List<List<Integer>> list, List<Integer> sub, int[] candidates, int target, int idx) {
        if(target < 0) {
            return;
        }
        if(idx > candidates.length) {
            return;
        }
        if(target == 0) {
            list.add(new ArrayList<>(sub));
            return;
        }
        for (int i = idx; i < candidates.length; i++) {
            if(i > idx && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if(target - candidates[i] >= 0) {
                sub.add(candidates[i]);
                combination(list, sub, candidates, target - candidates[i], i + 1);
                sub.remove(sub.size() - 1);
            }
        }
    }

}
