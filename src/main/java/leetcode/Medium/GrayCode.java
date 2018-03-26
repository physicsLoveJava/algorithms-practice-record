package leetcode.Medium;

import java.util.*;

/**
 * Problem Url: https://leetcode.com/problems/gray-code
 */
public class GrayCode {

    public List<Integer> grayCode(int n) {
        if(n < 1) {
            return Arrays.asList(0);
        }
        if(n == 1) {
            return Arrays.asList(0, 1);
        }
        List<Deque<Integer>> list = getOne();
        List<Deque<Integer>> rs = new ArrayList<>();
        for (int z = 1; z < n; z++) {
            if(!rs.isEmpty()) {
                list = rs;
                rs = new ArrayList<>();
            }
            for (int i = 0; i < list.size(); i++) {
                Deque<Integer> ele = new ArrayDeque<>(list.get(i));
                ele.addFirst(0);
                rs.add(ele);
            }
            for (int i = list.size() - 1; i >= 0 ; i--) {
                Deque<Integer> ele = new ArrayDeque<>(list.get(i));
                ele.addFirst(1);
                rs.add(ele);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (Deque<Integer> deque : rs) {
            ans.add(toDecimal(deque));
        }
        return ans;
    }

    private Integer toDecimal(Deque<Integer> deque) {
        StringBuilder sb = new StringBuilder();
        for (Integer val : deque) {
            sb.append(val);
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    public List<Deque<Integer>> getOne() {
        Deque<Integer> a = new ArrayDeque<>();
        Deque<Integer> b = new ArrayDeque<>();
        a.add(0);
        b.add(1);
        return Arrays.asList(
                a,
                b
        );
    }
}
