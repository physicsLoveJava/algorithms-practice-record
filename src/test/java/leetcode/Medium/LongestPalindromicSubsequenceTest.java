package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubsequenceTest {
    @Test
    public void longestPalindromeSubseq() throws Exception {

        assertEquals(4, new LongestPalindromicSubsequence()
        .longestPalindromeSubseq("bbbab"));

        assertEquals(2, new LongestPalindromicSubsequence()
        .longestPalindromeSubseq("abbc"));

        assertEquals(1, new LongestPalindromicSubsequence()
        .longestPalindromeSubseq("abcd"));

    }

}