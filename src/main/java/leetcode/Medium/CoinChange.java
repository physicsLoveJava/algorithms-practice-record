package leetcode.Medium;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/coin-change
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount + 1];
        return changeCoin(coins, dp, amount);
    }

    private int changeCoin(int[] coins, int[] dp, int amount) {
        if(amount == 0) {
            return 0;
        }
        if(dp[amount] != 0) {
            return dp[amount];
        }
        int min = Integer.MAX_VALUE;
        for (int i = coins.length - 1; i >= 0; i--) {
            if(amount - coins[i] >= 0) {
                int changes = changeCoin(coins, dp, amount - coins[i]);
                if(changes != -1) {
                    min = Math.min(changes, min);
                }
            }
        }
        if(min == Integer.MAX_VALUE) {
            return dp[amount] = -1;
        }
        return dp[amount] = min + 1;
    }

}
