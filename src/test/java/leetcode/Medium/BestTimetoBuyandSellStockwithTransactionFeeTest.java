package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimetoBuyandSellStockwithTransactionFeeTest {
    @Test
    public void maxProfit() throws Exception {

        assertEquals(8, BestTimetoBuyandSellStockwithTransactionFee.maxProfit(
                new int[]{1, 3, 2, 8, 4, 9}, 2
        ));
        assertEquals(9, BestTimetoBuyandSellStockwithTransactionFee.maxProfit(
                new int[]{1, 0, 2, 8, 4, 9}, 2
        ));
        assertEquals(7, BestTimetoBuyandSellStockwithTransactionFee.maxProfit(
                new int[]{1, 3, 10, 8, 9, 9}, 2
        ));

    }

}