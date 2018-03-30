package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodeStringTest {
    @Test
    public void decodeString() throws Exception {

        assertEquals("aaabcbc", new DecodeString().decodeString("3[a]2[bc]"));
        assertEquals("accaccacc", new DecodeString().decodeString("3[a2[c]]"));
        assertEquals("abcabccdcdcdef", new DecodeString().decodeString("2[abc]3[cd]ef"));

    }

}