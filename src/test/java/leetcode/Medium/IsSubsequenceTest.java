package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsSubsequenceTest {
    @Test
    public void isSubsequence() throws Exception {

        assertTrue(new IsSubsequence().isSubsequence("ace", "abcde"));
        assertFalse(new IsSubsequence().isSubsequence("axe", "abcde"));

    }

}