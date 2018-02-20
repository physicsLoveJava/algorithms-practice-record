package leetcode.Medium;

import util.PrintUtils;

import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/triangle
 */
public class Triangle {

    public static int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.isEmpty()) {
            return 0;
        }
        int[][] dp = new int[triangle.size()][triangle.size()];
        for (int i = 0; i < triangle.size(); i++) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                if(i > 0) {
                    if(j > 0) {
                        dp[i][j] = Math.min(
                                dp[i - 1][j - 1] + row.get(j),
                                (j < i ? dp[i - 1][j] : dp[i - 1][j - 1]) + row.get(j)
                        );
                    }else {
                        dp[i][j] = dp[i - 1][j] + row.get(j);
                    }
                }else {
                    dp[i][j] = row.get(j);
                }
            }
        }
        PrintUtils.printMatrix(dp);
        int min = dp[triangle.size() - 1][0];
        for (int i = 0; i < triangle.size(); i++) {
            if(min > dp[triangle.size() - 1][i]) {
                min = dp[triangle.size() - 1][i];
            }
        }
        return min;
    }

}
