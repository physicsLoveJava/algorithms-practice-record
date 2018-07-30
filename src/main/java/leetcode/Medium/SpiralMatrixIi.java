package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/spiral-matrix-ii
 */
public class SpiralMatrixIi {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int cur = 1;
        for (int i = 0; i < Math.ceil(n / 2.0); i++) {
            int side = n - 2 * i;
            int step = side - 1;
            if(step < 0) {
                break;
            }
            if(step == 0) {
                matrix[i][i] = cur++;
                break;
            }
            //一行
            for (int j = 0; j < step; j++) {
                matrix[i][i + j] = cur ++;
            }
            //二行
            for (int j = 0; j < step; j++) {
                matrix[i + j][n - i - 1] = cur++;
            }
            //三行
            for (int j = 0; j < step; j++) {
                matrix[n - i - 1][step - j + i] = cur++;
            }
            //四行
            for (int j = 0; j < step; j++) {
                matrix[step - j + i][i] = cur++;
            }
        }
        return matrix;
    }

}
