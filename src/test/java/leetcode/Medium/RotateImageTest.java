package leetcode.Medium;

import org.junit.Test;
import util.PrintUtils;

public class RotateImageTest {
    @Test
    public void rotate() throws Exception {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        new RotateImage().rotate(
                matrix
        );
        PrintUtils.printMatrix(matrix);
    }

}