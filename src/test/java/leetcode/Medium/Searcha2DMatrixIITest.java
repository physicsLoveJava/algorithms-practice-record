package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class Searcha2DMatrixIITest {

    @Test
    public void testException() {
        assertTrue(Searcha2DMatrixII.searchMatrix(
                new int[][]{
                        {1, 3}
                },
                3
        ));
    }

    @Test
    public void searchMatrix() throws Exception {

        assertFalse(Searcha2DMatrixII.searchMatrix(
                new int[][]{
                },
                5
        ));

        assertFalse(Searcha2DMatrixII.searchMatrix(
                new int[][]{
                        {1, 1}
                },
                5
        ));

        assertTrue(Searcha2DMatrixII.searchMatrix(
                new int[][]{
                        {1, 4, 7, 11, 15},
                        {2, 5, 8, 12, 19},
                        {3, 6, 9, 16, 22},
                        {10, 13, 14, 17, 24},
                        {18, 21, 23, 26, 3},
                },
                5
        ));

        assertFalse(Searcha2DMatrixII.searchMatrix(
                new int[][]{
                        {1, 4, 7, 11, 15},
                        {2, 5, 8, 12, 19},
                        {3, 6, 9, 16, 22},
                        {10, 13, 14, 17, 24},
                        {18, 21, 23, 26, 3},
                },
                20
        ));

    }

}