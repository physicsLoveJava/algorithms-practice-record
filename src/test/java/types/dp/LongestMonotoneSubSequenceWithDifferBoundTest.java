package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestMonotoneSubSequenceWithDifferBoundTest {
    @Test
    public void find() throws Exception {

        assertEquals(1, '4' - '3');
        assertEquals(4, LongestMonotoneSubSequenceWithDifferBound.find("12589"));
        assertEquals(4, LongestMonotoneSubSequenceWithDifferBound.find("761478"));

    }

}