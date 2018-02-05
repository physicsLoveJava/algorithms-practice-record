package types.dp;

import util.PrintUtils;

public class IntegerKnapsack {

    static int[][] dp = new int[10][10];

    public static int find(int[] prices, int[] weights, int limit) {
        if(prices == null || weights == null) {
            return 0;
        }
        if(prices.length != weights.length) {
            throw new IllegalArgumentException("illegal args");
        }
        int findx = findx(prices, weights, limit, prices.length - 1);
//        PrintUtils.printMatrix(dp, 3);
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
            if(limit >= weights[0]) {
                dp[end][limit] = findx(prices, weights, limit - weights[0], 0) + prices[0];
            }else {
                dp[end][limit] = 0;
            }
        }else {
            int temp = 0;
            for (int i = 0; i <= end; i++) {
                int cur = 0;
                if(limit - weights[i] >= 0) {
                    cur = findx(prices, weights, limit - weights[i], end) + prices[i];
                }
                if(cur > temp) {
                    temp = cur;
                }
            }
            dp[end][limit] = Math.max(
                    findx(prices, weights, limit, end - 1),
                    temp
            );
        }
        System.out.printf("end: %d, limit: %d, val: %d\n", end, limit, dp[end][limit]);
        return dp[end][limit];
    }

}
