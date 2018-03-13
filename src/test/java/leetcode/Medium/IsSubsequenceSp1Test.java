package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsSubsequenceSp1Test {
    @Test
    public void isSubsequence() throws Exception {

        assertTrue(new IsSubsequence().isSubsequence("ace", "abcde"));
        assertFalse(new IsSubsequence().isSubsequence("axe", "abcde"));
        assertTrue(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
        assertTrue(new IsSubsequence().isSubsequence("leetcode", "yyyyyyyyyyylyyeyyeyyytycyyoydyyyyyyyyyyeyyyyyyyyyy"));
    }

}