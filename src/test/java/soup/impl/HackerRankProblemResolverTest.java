package soup.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class HackerRankProblemResolverTest {

    HackerRankProblemResolver resolver = new HackerRankProblemResolver();

    @Test
    public void resolve() throws Exception {
        resolver.resolve("https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem");
    }

}