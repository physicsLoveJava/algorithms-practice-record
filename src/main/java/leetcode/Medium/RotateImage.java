package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/rotate-image
 */
public class RotateImage {

    public void rotate(int[][] matrix) {
        if(matrix == null) {
            return ;
        }
        transpose(matrix);
        flipLR(matrix);
    }

    private void flipLR(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix[i]);
        }
    }

    private void reverse(int[] matrix) {
        int s = 0, e = matrix.length - 1;
        while (s < e) {
            swap(matrix, s++, e--);
        }
    }

    private void swap(int[] matrix, int x, int y) {
        int tmp = matrix[x];
        matrix[x] = matrix[y];
        matrix[y] = tmp;
    }

    private void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                swap(matrix, i, j, j, i);
            }
        }
    }


    /**
     * x, y
     * tmp = y
     * y = x
     * x = tmp
     * @param matrix
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     */
    private void swap(int[][] matrix, int x1, int y1, int x2, int y2) {
        int tmp = matrix[x1][y1];
        matrix[x1][y1] = matrix[x2][y2];
        matrix[x2][y2] = tmp;
    }

}
