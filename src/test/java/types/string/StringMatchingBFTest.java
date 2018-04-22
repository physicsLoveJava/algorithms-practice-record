package types.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringMatchingBFTest {
    @Test
    public void match() throws Exception {

        assertEquals(5, new StringMatchingBF().match("abcdefghi", "fgh"));

    }

}