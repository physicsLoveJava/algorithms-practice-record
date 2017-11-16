package soup;

import org.junit.Test;

import static org.junit.Assert.*;

public class HackerRankAgentTest {
    @Test
    public void run() throws Exception {
        new HackerRankAgent("strings", 8).run();
        new HackerRankAgent("arrays-and-sorting", 8).run();
        new HackerRankAgent("search", 8).run();
        new HackerRankAgent("graph-theory", 8).run();
        new HackerRankAgent("constructive-algorithms", 8).run();
        new HackerRankAgent("bit-manipulation", 8).run();
        new HackerRankAgent("game-theory", 8).run();
        new HackerRankAgent("np-complete-problems", 8).run();
//        new HackerRankAgent("recursion", 8).run();
//        new HackerRankAgent("dynamic-programming", 8).run();
//        new HackerRankAgent("greedy", 8).run();
    }
}