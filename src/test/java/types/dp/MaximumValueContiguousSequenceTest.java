package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumValueContiguousSequenceTest {
    @Test
    public void find() throws Exception {

        assertEquals(11, MaximumValueContiguousSequence.find(
                new int[] {
                        1, -2, 3, 8, -5, 3
                }
        ));

        assertEquals(12, MaximumValueContiguousSequence.find(
                new int[] {
                        1, -2, 3, 8, -5, -2, 8
                }
        ));

    }

}