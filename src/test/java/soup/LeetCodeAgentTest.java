package soup;

import org.junit.Test;
import soup.impl.leetcode.LeetCodeLevel;

public class LeetCodeAgentTest {

    @Test
//    @Ignore
    public void testX() {
        new LeetCodeAgent(LeetCodeLevel.HARD, 8).run();
    }

}