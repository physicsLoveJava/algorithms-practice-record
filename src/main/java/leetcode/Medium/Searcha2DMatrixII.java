package leetcode.Medium;

/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 */
public class Searcha2DMatrixII {

    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return false;
        }
        if(matrix.length == 1 && matrix[0].length == 1) return matrix[0][0] == target;
        return find(matrix, target, 0, matrix.length - 1, 0, matrix[0].length - 1);
    }

    private static boolean find(int[][] matrix, int target, int rowStart, int rowEnd, int colStart, int colEnd) {
        if(rowStart < 0 || rowEnd >= matrix.length
            || colStart < 0 || colEnd >= matrix[0].length
            || rowStart > rowEnd || colStart > colEnd) {
            return false;
        }
        int rowMid = (rowStart + rowEnd) / 2;
        int colMid = (colStart + colEnd) / 2;
        if(matrix[rowMid][colMid] == target) return true;
        else if(matrix[rowMid][colMid] > target) {
            return find(matrix, target, rowStart, rowMid-1, colStart, colMid-1)
                    || find(matrix, target, rowStart, rowMid-1, colMid, colEnd)
                    || find(matrix, target, rowMid, rowEnd, colStart, colMid-1);
        } else { // matrix[rowMid][colMid] < target
            return find(matrix, target, rowMid+1, rowEnd, colMid+1, colEnd)
                    || find(matrix, target, rowMid+1, rowEnd, colStart, colMid)
                    || find(matrix, target, rowStart, rowMid, colMid+1, colEnd);
        }
    }

}
