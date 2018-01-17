package leetcode.hard;

import java.util.Arrays;

/**
 * url: https://leetcode.com/problems/cherry-pickup/description/
 */
public class CherryPickup {

    int[][][] memo;
    int[][] grid;
    int N;
    int M;
    public int cherryPickup(int[][] grid) {
        this.grid = grid;
        N = grid.length;
        M = grid[0].length;
        memo = new int[N][M][M];
        for (int[][] layer: memo)
            for (int[] row: layer)
                Arrays.fill(row, Integer.MIN_VALUE);
        return Math.max(0, dp(0, 0, 0));
    }
    public int dp(int r1, int c1, int c2) {
        int r2 = r1 + c1 - c2;
        if (N == r1 || N == r2 || M == c1 || M == c2 ||
                grid[r1][c1] == -1 || grid[r2][c2] == -1) {
            return -999999;
        } else if (r1 == N-1 && c1 == M-1) {
            return grid[r1][c1];
        } else if (memo[r1][c1][c2] != Integer.MIN_VALUE) {
            return memo[r1][c1][c2];
        } else {
            int ans = grid[r1][c1];
            if (c1 != c2) ans += grid[r2][c2];
            ans += Math.max(Math.max(dp(r1, c1+1, c2+1), dp(r1+1, c1, c2+1)),
                    Math.max(dp(r1, c1+1, c2), dp(r1+1, c1, c2)));
            memo[r1][c1][c2] = ans;
            return ans;
        }
    }

}
