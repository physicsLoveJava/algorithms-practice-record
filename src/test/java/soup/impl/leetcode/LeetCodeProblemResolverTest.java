package soup.impl.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeetCodeProblemResolverTest {

    @Test
    public void testResolver() {
        new LeetCodeProblemResolver().resolve("https://leetcode.com/problems/number-of-longest-increasing-subsequence");
    }

}