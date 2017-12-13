package offer;

import java.util.*;

public class FindContinuousArrayNumsWithSpecificValue {

    public static List<List<Integer>> find(int val) {
        List<List<Integer>> list = new ArrayList<>();
        Deque<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        int i = 3;
        while(!queue.isEmpty() && i < val) {
            int sum = compute(queue);
            if(sum == val) {
                list.add(asList(queue));
                queue.addLast(i++);
            }else if(sum > val) {
                queue.pollFirst();
            }else if(sum < val) {
                queue.addLast(i++);
            }
        }
        return list;
    }

    private static List<Integer> asList(Queue<Integer> queue) {
        return Arrays.asList(queue.toArray(new Integer[0]));
    }

    private static int compute(Queue<Integer> queue) {
        int sum = 0;
        for (int x : queue) {
            sum += x;
        }
        return sum;
    }

}
