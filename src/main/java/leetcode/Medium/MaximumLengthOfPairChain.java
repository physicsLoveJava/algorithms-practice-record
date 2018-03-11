package leetcode.Medium;

import util.PrintUtils;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Problem Url: https://leetcode.com/problems/maximum-length-of-pair-chain
 */
public class MaximumLengthOfPairChain {

    public int findLongestChain(int[][] pairs) {

        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });

        int[] dp = new int[pairs.length];
        int max = 1;
        Arrays.fill(dp, 1);
        for (int i = 0; i < pairs.length; i++) {
            for (int j = i + 1; j < pairs.length; j++) {
                if(pairs[j][0] > pairs[i][1]) {
                    dp[j] = dp[i] + 1;
                }
                if(max < dp[j]) {
                    max = dp[j];
                }
            }
        }
        return max;
    }

}
