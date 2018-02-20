package leetcode.Medium;

import util.PrintUtils;

/**
 * Problem Url: https://leetcode.com/problems/minimum-path-sum
 */
public class MinimumPathSum {

    public static int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        int[][] dp = new int[grid.length + 1][grid[0].length + 1];
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if(i == grid.length - 1) {
                    dp[i][j] = dp[i][j + 1] + grid[i][j];
                }else if(j == grid[0].length - 1) {
                    dp[i][j] = dp[i + 1][j] + grid[i][j];
                }else {
                    dp[i][j] = Math.min(
                            dp[i + 1][j],
                            dp[i][j + 1]
                    ) + grid[i][j];
                }
            }
        }
        PrintUtils.printMatrix(dp);
        return dp[0][0];
    }

}
