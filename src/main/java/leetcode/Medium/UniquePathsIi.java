package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/unique-paths-ii
 */
public class UniquePathsIi {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        return compute(obstacleGrid, dp, 0, 0);
    }

    private int compute(int[][] obstacleGrid, int[][] dp, int i, int j) {
        if(obstacleGrid[i][j] == 1) {
            return dp[i][j] = 0;
        }
        if(i == obstacleGrid.length - 1 && j == obstacleGrid[0].length - 1) {
            return dp[i][j] = 1;
        }
        if(dp[i][j] != 0) {
            return dp[i][j];
        }
        int path = 0;
        if(rangeCheck(obstacleGrid, i, j + 1) && obstacleGrid[i][j + 1] == 0) {
            path += compute(obstacleGrid, dp, i, j + 1);
        }
        if(rangeCheck(obstacleGrid, i + 1, j) && obstacleGrid[i + 1][j] == 0) {
            path += compute(obstacleGrid, dp, i + 1, j);
        }
        return dp[i][j] = path;
    }

    private boolean rangeCheck(int[][] grid, int i, int j) {
        return !(i < 0 || i > grid.length - 1 || j < 0 || j > grid[0].length - 1);
    }

}
