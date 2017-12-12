package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindReverseCoupleCountsTest {
    @Test
    public void find() throws Exception {

        assertEquals(0, FindReverseCoupleCounts.find(new int[] {1, 2, 3, 4}));
        assertEquals(1, FindReverseCoupleCounts.find(new int[] {1, 3, 2, 4}));
        assertEquals(6, FindReverseCoupleCounts.find(new int[] {4, 3, 2, 1}));

    }

}