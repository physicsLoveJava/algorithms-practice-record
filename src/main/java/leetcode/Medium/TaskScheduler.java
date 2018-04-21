package leetcode.Medium;

import java.util.*;

/**
 * Problem Url: https://leetcode.com/problems/task-scheduler
 */
public class TaskScheduler {

    class Pair {
        int val;
        int count;

        public Pair(int val, int count) {
            this.val = val;
            this.count = count;
        }
    }

    public int leastInterval(char[] tasks, int n) {
        if(tasks == null || tasks.length == 0) {
            return 0;
        }
        int[] counts = new int[26];
        Queue<Pair> queue = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.count - o1.count;
            }
        });
        for (char task : tasks) {
            counts[task - 'A'] += 1;
        }
        for (int i = 0; i < counts.length; i++) {
            if(counts[i] > 0) {
                queue.add(new Pair(i, counts[i]));
            }
        }
        int least = 0;
        while(!queue.isEmpty()) {
            List<Pair> pairList = new ArrayList<>();
            int subCount = 0;
            for (int i = 0; i < n + 1; i++) {
                if(!queue.isEmpty()) {
                    Pair pair = queue.poll();
                    subCount++;
                    pairList.add(pair);
                }
            }
            for (Pair pair : pairList) {
                if(pair.count - 1 > 0) {
                    pair.count -= 1;
                    queue.add(pair);
                }
            }
            least += queue.isEmpty() ? subCount : n + 1;
        }
        return least;
    }

}
