package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecodeWaysTest {
    @Test
    public void numDecodings() throws Exception {

        assertEquals(0, DecodeWays.numDecodings("0"));
        assertEquals(1, DecodeWays.numDecodings("1"));
        assertEquals(2, DecodeWays.numDecodings("12"));
        assertEquals(3, DecodeWays.numDecodings("121"));
        assertEquals(5, DecodeWays.numDecodings("1211"));
        assertEquals(0, DecodeWays.numDecodings("1001"));
        assertEquals(1, DecodeWays.numDecodings("10"));
        assertEquals(1, DecodeWays.numDecodings("1010"));
        assertEquals(0, DecodeWays.numDecodings("01"));
        assertEquals(0, DecodeWays.numDecodings("1090"));

    }

}