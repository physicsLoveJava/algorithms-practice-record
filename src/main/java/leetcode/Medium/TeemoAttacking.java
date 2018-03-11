package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/teemo-attacking
 */
public class TeemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {

        if(timeSeries == null || timeSeries.length == 0) {
            return 0;
        }

        int totals = timeSeries[timeSeries.length - 1] + duration - timeSeries[0];

        for (int i = 0; i < timeSeries.length - 1; i++) {
            int gap = timeSeries[i + 1] - timeSeries[i] - duration;
            if(gap > 0) {
                totals -= gap;
            }
        }

        return totals;
    }

}
