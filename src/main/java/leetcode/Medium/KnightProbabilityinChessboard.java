package leetcode.Medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/knight-probability-in-chessboard/description/
 */
public class KnightProbabilityinChessboard {

    public double knightProbability(int N, int K, int r, int c) {
        int[][] dp = new int[N][N];
        for (int[] ints : dp) {
            Arrays.fill(ints, 1);
        }
        for (int i = 0; i < K; i++) {
            int[][] dpX = new int[N][N];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int[] direct : directs) {
                        int row = direct[0] + j;
                        int col = direct[1] + k;
                        if(isOnBoard(row, col, N)) {
                            dpX[j][k] += dp[row][col];
                        }
                    }
                }
            }
            dp = dpX;
        }
        return dp[r][c] / Math.pow(8, K);
    }

    private boolean isOnBoard(int row, int col, int n) {
        return row >= 0 && row <= n - 1
                && col >=0 && col <= n - 1;
    }

    static int[][] directs = new int[][] {
            {1, 2},
            {1, -2},
            {-1, -2},
            {-1, 2},
            {2, 1},
            {2, -1},
            {-2, -1},
            {-2, 1}
    };

}
