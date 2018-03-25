package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HouseRobberIiTest {
    @Test
    public void rob() throws Exception {

        assertEquals(10, new HouseRobberIi().rob(
                new int[] {
                        4, 1, 5, 6, 2
                }
        ));

    }

}