package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestIncreasingSubSequence2Test {
    @Test
    public void find() throws Exception {
        assertEquals(4, LongestIncreasingSubSequence2.find(new int[]{1, 2, 3, 1, 5}));
        assertEquals(4, LongestIncreasingSubSequence2.find(new int[]{1, 2, 1, 3, 5}));
        assertEquals(3, LongestIncreasingSubSequence2.find(new int[]{1, 2, 1, 1, 6}));
    }
}