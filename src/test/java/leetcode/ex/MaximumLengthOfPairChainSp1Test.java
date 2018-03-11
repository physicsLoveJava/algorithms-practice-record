package leetcode.ex;

import leetcode.Medium.MaximumLengthOfPairChain;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumLengthOfPairChainSp1Test {
    @Test
    public void findLongestChain() throws Exception {

        assertEquals(2, new MaximumLengthOfPairChainSp1().findLongestChain(
                new int[][] {
                        {1, 2},
                        {2, 3},
                        {3, 4}
                }
        ));

        assertEquals(3, new MaximumLengthOfPairChainSp1().findLongestChain(
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