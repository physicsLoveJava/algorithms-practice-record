package leetcode.contest.c2;

import java.util.*;

public class BuyingHat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(scanner.nextInt());
        }

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });
        for (int val : set) {
            if(queue.size() >= 3 && queue.peek() > val) {
                queue.poll();
            }
            if(queue.size() < 3) {
                queue.offer(val);
            }
        }
        if(queue.size() < 3) {
            System.out.println(-1);
        }else {
            System.out.println(queue.poll());
        }
    }

}
