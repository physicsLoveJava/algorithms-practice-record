package leetcode.Medium;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/network-delay-time/description/
 */
public class NetWorkDelayTime {

    public int networkDelayTime(int[][] times, int n, int k) {
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k - 1] = 0;
        int[][] adjMatrix = new int[n][n];
        for (int[] matrix : adjMatrix) {
            Arrays.fill(matrix, -1);
        }
        for (int i = 0; i < times.length; i++) {
            int[] row = times[i];
            adjMatrix[row[0] - 1][row[1] - 1] = row[2];
        }
        for (int i = 0; i < n; i++) {
            dfs(adjMatrix, dist, visited, k - 1, i, 0);
        }
        int max = 0;
        for (int i = 0; i < dist.length; i++) {
            if(max < dist[i]) {
                max = dist[i];
            }
        }
        return max == Integer.MAX_VALUE ? -1 : max;
    }

    private void dfs(int[][] adjMatrix, int[] dist, boolean[] visited, int source, int target, int cur) {
        if(visited[target] || adjMatrix[source][target] == -1) {
            return;
        }
        visited[target] = true;
        if(dist[target] > cur + adjMatrix[source][target]) {
            dist[target] = cur + adjMatrix[source][target];
            for (int i = 0; i < adjMatrix[target].length; i++) {
                dfs(adjMatrix, dist, visited, target, i, dist[target]);
            }
        }
        visited[target] = false;
    }

}
