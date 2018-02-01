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
        assertEquals(4, LongMonotoneSubSequence.find("2431675"));

    }

    @Test
    public void findWithSeq() throws Exception {

        assertEquals("3", LongMonotoneSubSequence.findWithSeq("321"));
        assertEquals("567", LongMonotoneSubSequence.findWithSeq("567"));
        assertEquals("123567", LongMonotoneSubSequence.findWithSeq("13243567"));
        assertEquals("2367", LongMonotoneSubSequence.findWithSeq("243167"));
        assertEquals("2367", LongMonotoneSubSequence.findWithSeq("2431675"));

    }

}