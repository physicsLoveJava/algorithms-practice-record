package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinChangeTest {
    @Test
    public void coinChange() throws Exception {

        assertEquals(-1, new CoinChange().coinChange(
                new int[] {
                        2
                },
                3
        ));

    }

}