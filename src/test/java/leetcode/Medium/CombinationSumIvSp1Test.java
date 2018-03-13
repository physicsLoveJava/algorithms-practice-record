package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class CombinationSumIvSp1Test {
    @Test
    public void combinationSum4() throws Exception {

        assertEquals(7, new CombinationSumIvSp1().combinationSum4(
                new int[] {1, 2, 3},
                4
        ));

        assertEquals(4, new CombinationSumIvSp1().combinationSum4(
                new int[] {1, 2, 3},
                3
        ));

        assertEquals(2, new CombinationSumIvSp1().combinationSum4(
                new int[] {1, 2, 3},
                2
        ));

        assertEquals(39882198, new CombinationSumIvSp1().combinationSum4(
                new int[] {4, 2, 1},
                32
        ));

    }

}