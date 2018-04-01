package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/unique-paths-ii
 */
public class UniquePathsIiSp1 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }
        int[] dp = new int[obstacleGrid[0].length];
        dp[0] = 1;
        for (int[] row : obstacleGrid) {
            for (int i = 0; i < obstacleGrid[0].length; i++) {
                if(row[i] == 1) {
                    dp[i] = 0;
                }else if(i > 0) {
                    dp[i] += dp[i - 1];
                }
            }
        }
        return dp[dp.length - 1];
    }

}
