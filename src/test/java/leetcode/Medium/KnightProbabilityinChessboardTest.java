package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class KnightProbabilityinChessboardTest {
    @Test
    public void knightProbability() throws Exception {

        double delta = 0.0001;

        assertEquals(0.0625, new KnightProbabilityinChessboard().knightProbability(
                3, 2, 0, 0
        ), delta);

    }

}