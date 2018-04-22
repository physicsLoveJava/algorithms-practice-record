package types.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringMatchingKmpTest {
    @Test
    public void match() throws Exception {

        assertEquals(5, new StringMatchingKmp().match("abcdefghi", "fgh"));

    }

}