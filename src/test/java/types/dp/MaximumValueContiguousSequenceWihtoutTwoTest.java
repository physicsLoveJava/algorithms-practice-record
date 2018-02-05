package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumValueContiguousSequenceWihtoutTwoTest {
    @Test
    public void find() throws Exception {

        assertEquals(1, MaximumValueContiguousSequenceWihtoutTwo.find(
                new int[] {
                        1
                }
        ));

        assertEquals(4, MaximumValueContiguousSequenceWihtoutTwo.find(
                new int[] {
                        1, 4
                }
        ));

        assertEquals(12, MaximumValueContiguousSequenceWihtoutTwo.find(
                new int[] {
                        1, -2, 3, 8, -5, 3
                }
        ));

        assertEquals(17, MaximumValueContiguousSequenceWihtoutTwo.find(
                new int[] {
                        1, -2, 3, 8, -5, -2, 8
                }
        ));

    }

}