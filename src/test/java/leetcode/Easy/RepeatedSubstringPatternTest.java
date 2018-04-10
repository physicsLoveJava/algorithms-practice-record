package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RepeatedSubstringPatternTest {
    @Test
    public void repeatedSubstringPattern() throws Exception {

        assertFalse(new RepeatedSubstringPattern().repeatedSubstringPattern("a"));
        assertTrue(new RepeatedSubstringPattern().repeatedSubstringPattern("abaababaab"));

    }

}