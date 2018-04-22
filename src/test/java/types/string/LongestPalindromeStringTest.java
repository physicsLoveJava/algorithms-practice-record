package types.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromeStringTest {
    @Test
    public void find() throws Exception {

        assertEquals(4, new LongestPalindromeString().find("abba"));
        assertEquals(5, new LongestPalindromeString().find("abcba"));
        assertEquals(15, new LongestPalindromeString().find("abbcccxxxcccbbattt"));

    }

}