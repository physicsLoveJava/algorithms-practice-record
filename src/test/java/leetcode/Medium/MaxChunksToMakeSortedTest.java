package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxChunksToMakeSortedTest {
    @Test
    public void maxChunksToSorted() throws Exception {

        assertEquals(4, new MaxChunksToMakeSorted().maxChunksToSorted(
                new int[]{
                        1, 0, 2, 3, 4
                }
        ));

    }

}