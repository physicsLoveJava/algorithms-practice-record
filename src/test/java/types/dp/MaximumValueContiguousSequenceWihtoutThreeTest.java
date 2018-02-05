package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumValueContiguousSequenceWihtoutThreeTest {
    @Test
    public void find() throws Exception {

        assertEquals(1, MaximumValueContiguousSequenceWihtoutThree.find(
                new int[] {
                        1
                }
        ));

        assertEquals(4, MaximumValueContiguousSequenceWihtoutThree.find(
                new int[] {
                        1, 4
                }
        ));

        assertEquals(15, MaximumValueContiguousSequenceWihtoutThree.find(
                new int[] {
                        1, -2, 3, 8, -5, 3
                }
        ));

        assertEquals(20, MaximumValueContiguousSequenceWihtoutThree.find(
                new int[] {
                        1, -2, 3, 8, -5, -2, 8
                }
        ));

    }

}