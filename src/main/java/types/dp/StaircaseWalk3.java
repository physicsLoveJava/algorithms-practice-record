package types.dp;

import org.apache.commons.lang3.ArrayUtils;
import util.PrintUtils;

public class StaircaseWalk3 {

    public static int[] walk(int[][] matrix, int rows, int cols) {
        if(matrix == null || rows < 1 || cols < 1) {
            return null;
        }
        int[] p = new int[rows + cols - 1];
        int[][] val = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(i > 0 && j > 0) {
                    val[i][j] += Math.min(val[i][j - 1], val[i - 1][j]);
                }else if(i == 0 && j > 0) {
                    val[i][j] += val[i][j - 1];
                }else if(i > 0) {
                    val[i][j] += val[i - 1][j];
                }
                val[i][j] += matrix[i][j];
            }
        }

        int k = rows + cols - 2;
        int i = rows - 1;
        int j = cols - 1;
        while(k >= 0) {
            p[k--] = val[i][j];
            if(j > 0 && i > 0) {
                int prev = val[i][j] - matrix[i][j];
                if(prev == val[i][j - 1]) {
                    j--;
                }else {
                    i--;
                }
            }else if(i == 0 && j > 0) {
                j--;
            }else if(j == 0 && i > 0) {
                i--;
            }
        }

        return p;
    }

}
