package leetcode.ex;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Searcha2DMatrixSp1 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        int row = 0;
        int col = matrix[0].length - 1;
        while(row >= 0 && col >= 0 && row < matrix.length
                && col < matrix[0].length) {
            if(matrix[row][col] == target) {
                return true;
            }else if(matrix[row][col] < target) {
                row ++;
            }else {
                col --;
            }
        }
        return false;
    }

}
