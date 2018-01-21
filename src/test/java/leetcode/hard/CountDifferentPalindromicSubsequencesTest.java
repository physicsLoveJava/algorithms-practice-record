package leetcode.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountDifferentPalindromicSubsequencesTest {
    @Test
    public void countPalindromicSubsequences() throws Exception {

        assertEquals(6, CountDifferentPalindromicSubsequences.countPalindromicSubsequences("bccb"));
        assertEquals(104860361, CountDifferentPalindromicSubsequences.countPalindromicSubsequences("abcdabcdabcdabcdabcdabcdabcdabcddcbadcbadcbadcbadcbadcbadcbadcba"));

    }

}