package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ToeplitzMatrixTest {
    @Test
    public void isToeplitzMatrix() throws Exception {

        assertTrue(new ToeplitzMatrix().isToeplitzMatrix(
                new int[][] {
                        {1, 2, 3, 4},
                        {5, 1, 2, 3},
                        {9, 5, 1, 2}
                }
        ));

        assertFalse(new ToeplitzMatrix().isToeplitzMatrix(
                new int[][] {
                        {1, 2},
                        {1, 2}
                }
        ));

    }

}