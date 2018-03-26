package leetcode.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/combination-sum
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        combination(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void combination(List<List<Integer>> list, List<Integer> sub, int[] candidates, int target, int idx) {
        if(target == 0) {
            list.add(new ArrayList<>(sub));
            return;
        }
        for (int i = idx; i < candidates.length; i++) {
            if(target - candidates[i] >= 0) {
                sub.add(candidates[i]);
                combination(list, sub, candidates, target - candidates[i], i);
                sub.remove(sub.size() - 1);
            }
        }
    }

}
