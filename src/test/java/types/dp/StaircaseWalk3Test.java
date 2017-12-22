package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaircaseWalk3Test {
    @Test
    public void walk() throws Exception {

        assertArrayEquals(new int[] {
            1, 3, 5, 6, 7, 8, 10
        }, StaircaseWalk3.walk(new int[][] {
                {1, 2, 3, 4},
                {3, 2, 1, 1},
                {2, 4, 6, 1},
                {1, 2, 2, 2}
        }, 4, 4));

    }

}