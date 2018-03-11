package leetcode.ex;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Problem Url: https://leetcode.com/problems/maximum-length-of-pair-chain
 */
public class MaximumLengthOfPairChainSp1 {

    public int findLongestChain(int[][] pairs) {

        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int count = 0;
        int cur = Integer.MIN_VALUE;

        for (int i = 0; i < pairs.length; i++) {
            if(pairs[i][0] > cur) {
                cur = pairs[i][1];
                count++;
            }
        }

        return count;
    }

}
