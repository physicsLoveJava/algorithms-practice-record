package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {
    @Test
    public void longestPalindrome() throws Exception {

        assertEquals("a", LongestPalindromicSubstring.longestPalindrome("a"));
        assertEquals("aa", LongestPalindromicSubstring.longestPalindrome("aa"));
        assertEquals("bb", LongestPalindromicSubstring.longestPalindrome("abb"));
        assertEquals("abcba", LongestPalindromicSubstring.longestPalindrome("abcba"));
        assertEquals("a", LongestPalindromicSubstring.longestPalindrome("abcda"));
        assertEquals("aba", LongestPalindromicSubstring.longestPalindrome("babad"));
        assertEquals("bb", LongestPalindromicSubstring.longestPalindrome("cbbd"));
        assertEquals("cc", LongestPalindromicSubstring.longestPalindrome("ccd"));
        assertEquals("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", LongestPalindromicSubstring.longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"));

    }

}