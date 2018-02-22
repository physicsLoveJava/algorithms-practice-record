package leetcode.ex;

import leetcode.Medium.PredictTheWinner;
import org.junit.Test;

import static org.junit.Assert.*;

public class PredictWinnerSp1Test {
    @Test
    public void predictTheWinner() throws Exception {

        assertFalse(new PredictWinnerSp1().PredictTheWinner(
                new int[] {
                        1, 5, 2
                }
        ));

        assertTrue(new PredictWinnerSp1().PredictTheWinner(
                new int[] {
                        1, 5, 233, 7
                }
        ));

    }

}