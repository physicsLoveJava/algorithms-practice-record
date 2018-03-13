package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class CombinationSumIvTest {
    @Test
    public void combinationSum4() throws Exception {

        assertEquals(7, new CombinationSumIv().combinationSum4(
                new int[] {1, 2, 3},
                4
        ));

        assertEquals(4, new CombinationSumIv().combinationSum4(
                new int[] {1, 2, 3},
                3
        ));

        assertEquals(2, new CombinationSumIv().combinationSum4(
                new int[] {1, 2, 3},
                2
        ));

//        assertEquals(2, new CombinationSumIv().combinationSum4(
//                new int[] {4, 2, 1},
//                32
//        ));

    }

}