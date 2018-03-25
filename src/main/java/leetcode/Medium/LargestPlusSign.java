package leetcode.Medium;

import java.util.HashSet;
import java.util.Set;

/**
 *  https://leetcode.com/problems/largest-plus-sign/description/
 */
public class LargestPlusSign {

    public int orderOfLargestPlusSign(int N, int[][] mines) {

        Set<Integer> set = new HashSet<>();
        for (int[] mine : mines) {
            set.add(mine[0] * N + mine[1]);
        }

        int[][] dp = new int[N][N];

        int count = 0;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                count = set.contains(i * N + j) ? 0 : count + 1;
                dp[i][j] = count;
            }

            count = 0;
            for (int j = N - 1; j >=0; j --) {
                count = set.contains(i * N + j) ? 0 : count + 1;
                dp[i][j] = Math.min(count, dp[i][j]);
            }
        }


        for (int i = 0; i < N; i++) {
            count = 0;
            for (int j = 0; j < N; j++) {
                count = set.contains(j * N + i) ? 0 : count + 1;
                dp[j][i] = Math.min(count, dp[j][i]);
            }

            count = 0;
            for (int j = N - 1; j >=0; j --) {
                count = set.contains(j * N + i) ? 0 : count + 1;
                dp[j][i] = Math.min(count, dp[j][i]);
                ans = Math.max(dp[j][i], ans);
            }
        }

        return ans;
    }

}
