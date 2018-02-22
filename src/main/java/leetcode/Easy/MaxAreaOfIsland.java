package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/max-area-of-island
 */
public class MaxAreaOfIsland {

    public int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, dfs(grid, visited, i, j));
            }
        }
        return max;
    }

    private int dfs(int[][] grid, boolean[][] visited, int x, int y) {
        if(x < 0 || y < 0 || x > grid.length - 1
                || y > grid[0].length - 1
                || visited[x][y]
                || grid[x][y] == 0) {
            return 0;
        }
        visited[x][y] = true;
        return 1
                + dfs(grid, visited, x + 1, y)
                + dfs(grid, visited, x, y + 1)
                + dfs(grid, visited, x - 1, y)
                + dfs(grid, visited, x, y - 1);
    }

}
