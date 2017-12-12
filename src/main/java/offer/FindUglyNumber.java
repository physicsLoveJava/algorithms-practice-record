package offer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class FindUglyNumber {

    public static Set<Integer> find(int max) {
        if(max < 1) {
            return new TreeSet<>();
        }
        TreeSet<Integer> set = new TreeSet<>();
        Queue<Integer> queue = new LinkedList<>();
        set.add(1);
        queue.add(1);
        while(!queue.isEmpty()) {
            Integer cur = queue.poll();
            int cur2 = cur * 2;
            int cur3 = cur * 3;
            int cur5 = cur * 5;
            if(checkIfOut(cur2, max)) {
                break;
            }
            set.add(cur2);
            queue.add(cur2);
            if(checkIfOut(cur3, max)) {
                break;
            }
            set.add(cur3);
            queue.add(cur3);
            if(checkIfOut(cur5, max)) {
                break;
            }
            set.add(cur5);
            queue.add(cur5);
        }
        return set;
    }

    private static boolean checkIfOut(int cur2, int max) {
        return cur2 > max;
    }

}
