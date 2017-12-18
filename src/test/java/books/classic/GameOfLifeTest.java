package books.classic;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameOfLifeTest {

    @Test(timeout = 5000)
    public void start() throws Exception {
        int size = 4;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = 1;
            }
        }
        GameOfLife.start(matrix, size, size);
    }

    @Test(timeout = 5000)
    public void start1() throws InterruptedException {

        int[][] matrix = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0,},
                {0, 1, 1, 1, 0,},
                {0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0,},
        };

        GameOfLife.start(matrix, 5, 5);
    }

}