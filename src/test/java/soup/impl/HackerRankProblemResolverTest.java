package soup.impl;

import org.junit.Test;
import soup.impl.hackerrank.HackerRankProblemResolver;

public class HackerRankProblemResolverTest {

    HackerRankProblemResolver resolver = new HackerRankProblemResolver();

    @Test
    public void resolve() throws Exception {
        resolver.resolve("dynamic-programming", "https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem");
    }

}