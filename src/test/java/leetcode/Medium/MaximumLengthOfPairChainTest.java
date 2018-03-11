package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumLengthOfPairChainTest {
    @Test
    public void findLongestChain() throws Exception {

        assertEquals(2, new MaximumLengthOfPairChain().findLongestChain(
                new int[][] {
                        {1, 2},
                        {2, 3},
                        {3, 4}
                }
        ));

        assertEquals(3, new MaximumLengthOfPairChain().findLongestChain(
                new int[][] {
                        {1, 2},
                        {1, 3},
                        {3, 4},
                        {5, 6},
                        {6, 8},
                        {6, 7}
                }
        ));

    }

}