package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromicSubstringsTest {
    @Test
    public void countSubstrings() throws Exception {

        assertEquals(3, PalindromicSubstrings.countSubstrings("abc"));
        assertEquals(6, PalindromicSubstrings.countSubstrings("aaa"));

    }

}