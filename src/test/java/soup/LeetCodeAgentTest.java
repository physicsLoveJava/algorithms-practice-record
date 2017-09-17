package soup;

import org.junit.Test;
import soup.impl.leetcode.LeetCodeLevel;

import static org.junit.Assert.*;

public class LeetCodeAgentTest {

    @Test
    public void testX() {
        new LeetCodeAgent(LeetCodeLevel.MEDIUM, 8).run();
    }

}