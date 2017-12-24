package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestIncreasingSubsequenceTest {
    @Test
    public void find() throws Exception {
        assertEquals(4, LongestIncreasingSubsequence.find(new int[]{1, 2, 3, 1, 5}));
        assertEquals(4, LongestIncreasingSubsequence.find(new int[]{1, 2, 1, 3, 5}));
        assertEquals(3, LongestIncreasingSubsequence.find(new int[]{1, 2, 1, 1, 6}));
    }

}