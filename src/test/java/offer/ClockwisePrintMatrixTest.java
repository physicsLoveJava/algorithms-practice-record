package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClockwisePrintMatrixTest {

    @Test
    public void print() throws Exception {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        ClockwisePrintMatrix.print(matrix, 4, 4);
    }

    @Test
    public void print2() throws Exception {
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7},
                {5, 6, 7, 8, 9, 10, 11},
                {9, 10, 11, 12, 13, 14, 15},
        };
        ClockwisePrintMatrix.print(matrix, 3, 7);
    }

    @Test
    public void print3() throws Exception {
        int[][] matrix = {
                {1, 5, 9},
                {2, 6, 10},
                {3, 7, 11},
                {4, 8, 12},
                {5, 9, 13},
                {6, 10, 14},
                {7, 11, 15}
        };
        ClockwisePrintMatrix.print(matrix, 7, 3);
    }

}