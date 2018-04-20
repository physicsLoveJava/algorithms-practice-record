package types.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestIncreasingSubsequence_1Test {
    @Test
    public void find() throws Exception {

        assertEquals(4, new LongestIncreasingSubsequence_1().find(new int[]{1, 2, 3, 1, 5}));
        assertEquals(4, new LongestIncreasingSubsequence_1().find(new int[]{1, 2, 1, 3, 5}));
        assertEquals(3, new LongestIncreasingSubsequence_1().find(new int[]{1, 2, 1, 1, 6}));

    }

}