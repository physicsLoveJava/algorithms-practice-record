package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerKnapsackTest {
    @Test
    public void find() throws Exception {

        assertEquals(350, IntegerKnapsack.find(
                new int[] {
                        100, 500, 250, 800
                },
                new int[] {
                        1, 4, 2, 5
                },
                3
        ));

        assertEquals(500, IntegerKnapsack.find(
                new int[] {
                        100, 500, 250, 800
                },
                new int[] {
                        1, 4, 2, 5
                },
                4
        ));

        assertEquals(800, IntegerKnapsack.find(
                new int[] {
                        100, 500, 250, 800
                },
                new int[] {
                        1, 4, 2, 5
                },
                5
        ));

        assertEquals(900, IntegerKnapsack.find(
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