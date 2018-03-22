package leetcode.Easy;

import org.junit.Test;

public class FloodFillTest {
    @Test
    public void floodFill() throws Exception {

        new FloodFill().floodFill(
                new int[][] {
                        {1, 1, 1},
                        {1, 1, 0},
                        {1, 0, 1}
                },
                1, 1, 2
        );

    }

}