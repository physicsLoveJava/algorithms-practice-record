package leetcode.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredictWinnerSp2Test {
    @Test
    public void predictTheWinner() throws Exception {

        assertFalse(new PredictWinnerSp2().PredictTheWinner(
                new int[] {
                        1, 5, 2
                }
        ));

        assertTrue(new PredictWinnerSp2().PredictTheWinner(
                new int[] {
                        1, 5, 233, 7
                }
        ));

    }

}