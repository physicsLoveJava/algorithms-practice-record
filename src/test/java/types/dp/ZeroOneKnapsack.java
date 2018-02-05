package types.dp;

import util.PrintUtils;

public class ZeroOneKnapsack {

    static int size = 10;

    static int[][] dp = new int[size][size];

    public static int find(int[] prices, int[] weights, int limit) {
        if(prices == null || weights == null) {
            return 0;
        }
        if(prices.length != weights.length) {
            throw new IllegalArgumentException("illegal args");
        }
        if(prices.length > size) {
            throw new IllegalArgumentException("illegal size, should below " + size);
        }
        dp = new int[size][size];
        int findx = findx(prices, weights, limit, prices.length - 1);
//        PrintUtils.printMatrix(dp, 3);
//        System.out.println();
        return findx;
    }

    private static int findx(int[] prices, int[] weights, int limit, int end) {
        if(end < 0 || limit <= 0) {
            return 0;
        }
        if(dp[end][limit] != 0) {
            return dp[end][limit];
        }
        if(end == 0) {
            dp[end][limit] = weights[0] <= limit ? prices[0] : 0;
        }else {
            int temp = 0;
            if(limit >= weights[end]) {
                temp = findx(prices, weights, limit - weights[end], end - 1) + prices[end];
            }
            dp[end][limit] = Math.max(
                    findx(prices, weights, limit, end - 1),
                    temp
            );
        }
        return dp[end][limit];
    }

}
