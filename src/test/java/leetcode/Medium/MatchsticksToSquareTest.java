package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MatchsticksToSquareTest {
    @Test
    public void makesquare() throws Exception {
        assertTrue(new MatchsticksToSquare().makesquare(new int[]{
                1, 1, 2, 2, 2
        }));
        assertFalse(new MatchsticksToSquare().makesquare(new int[]{
                3, 3, 3, 3, 4
        }));
        assertTrue(new MatchsticksToSquare().makesquare(new int[]{
                5, 5, 5, 5, 4, 4, 4, 4, 3, 3, 3, 3
        }));
    }

}