package soup.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class HackerRankFetcherTest {

    @Test
    public void fetch() throws Exception {
        System.out.println(new HackerRankFetcher("greedy").fetch());
    }

}