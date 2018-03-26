package leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/beautiful-arrangement
 */
public class BeautifulArrangement {

    public int countArrangement(int n) {
        if(n < 1) {
            return 0;
        }
        int size = 0;
        boolean[] visited = new boolean[n + 1];
        List<List<Integer>> rs = new ArrayList<>();
        countArrangement(rs, new ArrayList<>(), visited, 1);
        for (List<Integer> set : rs) {
            if(isBeautiful(set)) {
                System.out.println(set);
                size++;
            }
        }
        return size;
    }

    private boolean isBeautiful(List<Integer> set) {
        for (int i = 0; i < set.size(); i++) {
            Integer num = set.get(i);
            int idx = i + 1;
            if(!((num % idx) == 0 || (idx % num) == 0)) {
                return false;
            }
        }
        return true;
    }

    private void countArrangement(List<List<Integer>> rs, List<Integer> sub, boolean[] visited, int idx) {
        if(idx > visited.length - 1) {
            rs.add(new ArrayList<>(sub));
            return;
        }
        for (int i = 1; i < visited.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                sub.add(i);
                if(isBeautiful(sub)) {
                    countArrangement(rs, sub, visited, idx + 1);
                }
                sub.remove(sub.size() - 1);
                visited[i] = false;
            }
        }
    }

}
