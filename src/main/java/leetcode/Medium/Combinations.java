package leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/combinations
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        combine(list, new ArrayList<>(), n, 1, k);
        return list;
    }

    private void combine(List<List<Integer>> list, List<Integer> sub, int n, int idx, int k) {
        if(k == 0) {
            list.add(new ArrayList<>(sub));
            return;
        }
        if(idx > n) {
            return;
        }
        for (int i = idx; i <= n; i++) {
            sub.add(i);
            combine(list, sub, n, i + 1, k - 1);
            sub.remove(sub.size() - 1);
        }
    }

}
