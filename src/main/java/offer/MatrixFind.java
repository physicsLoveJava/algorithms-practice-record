package offer;

import util.adt.Pair;

/**
 * Matrix假设，沿着行和列单调递增
 *
 * 额外：如果严格递增
 */
public class MatrixFind {

    public static Pair<Integer, Integer> find(int[][] matrix, int rows, int cols, int value) {
        if(matrix == null) {
            return null;
        }
        int nRow = 0;
        int nCol = cols - 1;
        boolean done = false;
        Pair<Integer, Integer> pair = null;
        while(nRow <= rows - 1 && nCol >=0 && !done) {
            int cdt = matrix[nRow][nCol];
            if( cdt == value) {
                done = true;
                pair = Pair.of(nRow, nCol);
            } else if(cdt < value) {
                nRow ++;
            } else {
                nCol --;
            }
        }
        return pair;
    }

}
