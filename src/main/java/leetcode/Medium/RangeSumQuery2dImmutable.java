package leetcode.Medium;

/**
 * https://leetcode.com/problems/range-sum-query-2d-immutable/description/
 */
public class RangeSumQuery2dImmutable {

    class NumMatrix {

        int[][] dp;

        public NumMatrix(int[][] matrix) {
            if(matrix.length == 0) {
                return;
            }
            dp = new int[matrix.length][matrix[0].length];
            for (int i = 0; i < matrix.length; i++) {
                dp[i][0] = matrix[i][0];
                for (int j = 1; j < matrix[i].length; j++) {
                    dp[i][j] = dp[i][j - 1] + matrix[i][j];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int sum = 0;
            for (int i = row1; i <= row2; i++) {
                if(col1 == 0) {
                    sum += dp[i][col2];
                }else {
                    sum += dp[i][col2] - dp[i][col1 - 1];
                }
            }
            return sum;
        }
    }

}
