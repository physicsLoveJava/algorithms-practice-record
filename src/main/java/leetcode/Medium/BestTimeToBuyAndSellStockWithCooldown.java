package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown
 */
public class BestTimeToBuyAndSellStockWithCooldown {

    public int maxProfit(int[] prices) {

        int[] dp = new int[prices.length];
        return computed(prices, 0, dp);
    }

    private int computed(int[] prices, int start, int[] dp) {
        if(start > prices.length - 1) {
            return 0;
        }
        if(dp[start] != 0) {
            return dp[start];
        }
        int tmp = 0;
        for (int i = start + 1; i < prices.length; i++) {
            int cur = prices[i] - prices[start] + computed(prices, i + 2, dp);
            if(cur > tmp) {
                tmp = cur;
            }
        }
        return dp[start] = Math.max(tmp, computed(prices, start + 1, dp));
    }

}
