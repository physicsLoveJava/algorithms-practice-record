package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockWithCooldownTest {
    @Test
    public void maxProfit() throws Exception {

        assertEquals(3, new BestTimeToBuyAndSellStockWithCooldown().maxProfit(
                new int[] {
                        1, 2, 3, 0, 2
                }
        ));

        assertEquals(6, new BestTimeToBuyAndSellStockWithCooldown().maxProfit(
                new int[] {
                        1, 2, 3, 0, 2, 5
                }
        ));

    }

}