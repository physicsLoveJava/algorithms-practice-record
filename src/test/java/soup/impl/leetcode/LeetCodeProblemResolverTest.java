package soup.impl.leetcode;

import org.junit.Test;

public class LeetCodeProblemResolverTest {

    @Test
    public void testResolver() {
        new LeetCodeProblemResolver().resolve(LeetCodeLevel.MEDIUM.getLevel(), "https://leetcode.com/problems/number-of-longest-increasing-subsequence");
    }

}