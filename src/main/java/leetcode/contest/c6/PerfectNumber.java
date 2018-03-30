package leetcode.contest.c6;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

    public boolean perfectNumber(int n) {
        if(n == 1) {
            return true;
        }
        List<Integer> list = findDivider(n);
        int count = 0;
        for (Integer div : list) {
            count += div;
        }
        return count == n;
    }

    private List<Integer> findDivider(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

}
