package leetcode.hard;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BurstBalloonsTest {
    @Test
    public void maxCoins() throws Exception {

        assertEquals(167, new BurstBalloons().maxCoins(
                new int[]{
                        3, 1, 5, 8
                }
        ));

        assertEquals(3446, new BurstBalloons().maxCoins(
                new int[]{
                        8, 2, 6, 8, 9, 8, 1, 4, 1, 5, 3, 0, 7, 7, 0, 4, 2, 2
                }
        ));

    }

}