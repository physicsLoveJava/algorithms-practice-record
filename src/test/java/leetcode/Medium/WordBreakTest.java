package leetcode.Medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class WordBreakTest {
    @Test
    public void wordBreak() throws Exception {

        assertTrue(new WordBreak().wordBreak("leetcode",
                Arrays.asList("leet", "code")));

        assertTrue(new WordBreak().wordBreak("leetcode",
                Arrays.asList("le", "leet", "code")));

    }

}