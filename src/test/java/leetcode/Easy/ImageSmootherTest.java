package leetcode.Easy;

import org.junit.Test;
import util.PrintUtils;

import static org.junit.Assert.*;

public class ImageSmootherTest {
    @Test
    public void imageSmoother() throws Exception {

        int[][] ints = new ImageSmoother().imageSmoother(
                new int[][]{
                        {1, 1, 1},
                        {1, 0, 1},
                        {1, 1, 1},
                }
        );
        PrintUtils.printMatrix(ints);
    }

}