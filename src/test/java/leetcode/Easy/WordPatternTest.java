package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class WordPatternTest {
    @Test
    public void wordPattern() throws Exception {

        assertTrue(new WordPattern().wordPattern("abba", "dog cat cat dog"));
        assertFalse(new WordPattern().wordPattern("abba", "dog cat cat dogx"));
        assertFalse(new WordPattern().wordPattern("abba", "dog dog dog dog"));

    }

}