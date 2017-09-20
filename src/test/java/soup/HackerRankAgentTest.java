package soup;

import org.junit.Test;

import static org.junit.Assert.*;

public class HackerRankAgentTest {
    @Test
    public void run() throws Exception {
        new HackerRankAgent("dynamic-programming", 8).run();
//        new HackerRankAgent("greedy", 8).run();
    }
}