package leetcode.Medium;

import org.junit.Test;
import util.PrintUtils;

public class SpiralMatrixIiTest {
    @Test
    public void generateMatrix() throws Exception {

        PrintUtils.printMatrix(new SpiralMatrixIi().generateMatrix(3), 3);
        PrintUtils.printMatrix(new SpiralMatrixIi().generateMatrix(4), 3);
        PrintUtils.printMatrix(new SpiralMatrixIi().generateMatrix(5), 3);

    }

}