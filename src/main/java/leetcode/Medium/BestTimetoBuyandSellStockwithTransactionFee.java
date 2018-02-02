package leetcode.Medium;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/
 */
public class BestTimetoBuyandSellStockwithTransactionFee {

    public static int maxProfit(int[] prices, int fee) {
        if(prices == null) {
            return 0;
        }
        int cash = 0, hold = -prices[0];
        for (int i = 0; i < prices.length; i++) {
            cash = Math.max(cash, hold + prices[i] - fee);
            hold = Math.max(hold, cash - prices[i]);
        }
        return cash;
    }

}