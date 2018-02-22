package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class TargetSumTest {
    @Test
    public void findTargetSumWays() throws Exception {

        assertEquals(5, new TargetSum().findTargetSumWays(
                new int[] {
                        1, 1, 1, 1, 1
                },
                3
        ));

    }

}