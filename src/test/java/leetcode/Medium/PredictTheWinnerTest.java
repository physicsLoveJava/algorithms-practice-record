package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class PredictTheWinnerTest {
    @Test
    public void predictTheWinner() throws Exception {

        assertFalse(new PredictTheWinner().PredictTheWinner(
                new int[] {
                    1, 5, 2
                }
        ));

        assertTrue(new PredictTheWinner().PredictTheWinner(
                new int[] {
                        1, 5, 233, 7
                }
        ));

    }

}