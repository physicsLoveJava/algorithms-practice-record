package soup.impl;

import org.junit.Test;
import soup.impl.hackerrank.HackerRankFetcher;

public class HackerRankFetcherTest {

    @Test
    public void fetch() throws Exception {
        System.out.println(new HackerRankFetcher("greedy").fetch());
    }

}