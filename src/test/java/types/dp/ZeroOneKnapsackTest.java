package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZeroOneKnapsackTest {
    @Test
    public void find() throws Exception {

        assertEquals(350, ZeroOneKnapsack.find(
                new int[] {
                        100, 500, 250, 800
                },
                new int[] {
                        1, 4, 2, 5
                },
                3
        ));

        assertEquals(350, ZeroOneKnapsack.find(
                new int[] {
                        100, 300, 250, 800
                },
                new int[] {
                        1, 4, 2, 5
                },
                4
        ));

        assertEquals(670, ZeroOneKnapsack.find(
                new int[] {
                        100, 500, 170, 550
                },
                new int[] {
                        1, 4, 2, 5
                },
                6
        ));

        assertEquals(900, ZeroOneKnapsack.find(
                new int[] {
                        100, 500, 250, 800
                },
                new int[] {
                        1, 4, 2, 5
                },
                6
        ));

    }

}