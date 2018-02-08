package types.dp;

public class IntegerKnapsack {

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
