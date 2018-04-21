package leetcode.Medium;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/task-scheduler
 */
public class TaskSchedulerSp1 {

    public int leastInterval(char[] tasks, int n) {
        if(tasks == null || tasks.length == 0) {
            return 0;
        }
        int[] counts = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            counts[tasks[i] - 'A'] += 1;
        }
        Arrays.sort(counts);
        int i = counts.length - 1;
        while(i >= 0 && counts[i] == counts[25]) {
            i--;
        }
        return Math.max(tasks.length, (counts[25] - 1) * (n + 1) + 25 - i);
    }

}
