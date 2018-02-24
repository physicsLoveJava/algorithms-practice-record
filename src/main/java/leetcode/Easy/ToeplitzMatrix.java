package leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/toeplitz-matrix
 */
public class ToeplitzMatrix {

    public boolean isToeplitzMatrix(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < matrix[0].length; i++) {
            if(!isValid(matrix, 0, i)) {
                return false;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            if(!isValid(matrix, i, 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean isValid(int[][] matrix, int row, int col) {
        List<Integer> list = new ArrayList<>();
        while(rangeCheck(matrix, row, col)) {
            list.add(matrix[row][col]);
            row += 1;
            col += 1;
        }
        return isSame(list);
    }

    private boolean rangeCheck(int[][] matrix, int row, int col) {
        return !(row < 0 || row > matrix.length - 1
                || col < 0 || col > matrix[0].length - 1);
    }

    private boolean isSame(List<Integer> list) {
        if(list == null || list.isEmpty()) {
            return false;
        }
        int x = list.get(0);
        for (Integer val : list) {
            if(!val.equals(x)) {
                return false;
            }
        }
        return true;
    }

}
