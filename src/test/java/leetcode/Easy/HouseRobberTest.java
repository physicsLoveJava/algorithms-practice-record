package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class HouseRobberTest {
    @Test
    public void rob() throws Exception {

        assertEquals(14, HouseRobber.rob(
                new int[] {
                        3, 5, 2, 1, 9, 8
                }
        ));

        assertEquals(12, HouseRobber.rob(
                new int[] {
                        1, 2, 3, 4, 5, 6
                }
        ));

    }

}