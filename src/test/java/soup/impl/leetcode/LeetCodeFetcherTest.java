package soup.impl.leetcode;

import org.junit.Test;

public class LeetCodeFetcherTest {

    @Test
    public void testFetch() {
        System.out.println(new LeetCodeFetcher(LeetCodeLevel.MEDIUM).fetch());
    }

}