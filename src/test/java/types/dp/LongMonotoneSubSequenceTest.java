package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongMonotoneSubSequenceTest {
    @Test
    public void find() throws Exception {

        assertEquals(1, LongMonotoneSubSequence.find("321"));
        assertEquals(3, LongMonotoneSubSequence.find("567"));
        assertEquals(6, LongMonotoneSubSequence.find("13243567"));
        assertEquals(4, LongMonotoneSubSequence.find("243167"));

    }

}