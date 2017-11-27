package soup;

import org.junit.Ignore;
import org.junit.Test;
import soup.impl.leetcode.LeetCodeLevel;

import static org.junit.Assert.*;

public class LeetCodeAgentTest {

    @Test
//    @Ignore
    public void testX() {
        new LeetCodeAgent(LeetCodeLevel.EASY, 3).run();
    }

}