package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanPlaceFlowersTest {
    @Test
    public void canPlaceFlowers() throws Exception {

        assertTrue(new CanPlaceFlowers().canPlaceFlowers(
                new int[] {
                        0, 0, 0, 0, 0
                },
                3
        ));

        assertFalse(new CanPlaceFlowers().canPlaceFlowers(
                new int[] {
                        1, 0, 0, 0, 1
                },
                2
        ));

    }

}