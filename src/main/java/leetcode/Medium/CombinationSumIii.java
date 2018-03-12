package leetcode.Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem Url: https://leetcode.com/problems/combination-sum-iii
 */
public class CombinationSumIii {

    static boolean[] visited = new boolean[10];

    public List<List<Integer>> combinationSum3(int k, int n) {
        Set<Set<Integer>> rs = new HashSet<>();
        List<List<Integer>> resultList = new ArrayList<>();
        findCombination(k, n, new HashSet<>(), rs);
        for (Set<Integer> r : rs) {
            resultList.add(new ArrayList<>(r));
        }
        return resultList;
    }

    private void findCombination(int k, int n, Set<Integer> sub, Set<Set<Integer>> rs) {
        if(k == 0) {
            if(n == 0) {
                rs.add(new HashSet<>(sub));
            }
            return;
        }
        for (int i = 1; i < visited.length; i++) {
            if(!visited[i]) {
                if(!sub.isEmpty()) {
                    Integer cur = (Integer) sub.toArray()[sub.size() - 1];
                    if(cur > i) {
                        continue;
                    }
                }
                visited[i] = true;
                sub.add(i);
                findCombination(k - 1, n - i, sub, rs);
                sub.remove(i);
                visited[i] = false;
            }
        }
    }

}
