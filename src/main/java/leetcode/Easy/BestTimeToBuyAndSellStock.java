package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 */
public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int hold = prices[0], profit = 0;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - hold);
            hold = Math.min(hold, prices[i]);
            if(max < profit) {
                max = profit;
            }
        }
        return max;
    }

}
