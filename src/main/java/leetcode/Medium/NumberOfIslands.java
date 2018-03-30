package leetcode.Medium;

/**
 * Problem Url: https://leetcode.com/problems/number-of-islands
 */
public class NumberOfIslands {

    static int size = 0;

    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        size = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(!visited[i][j] && grid[i][j] == '1') {
                    size++;
                    dfs(grid, visited, i, j);
                }
            }
        }
        return size;
    }

    private void dfs(char[][] grid, boolean[][] visited, int r, int c) {
        if(r < 0 || r > grid.length - 1
                || c < 0 || c > grid[0].length - 1) {
            return;
        }
        if(visited[r][c] || grid[r][c] == '0') {
            return ;
        }
        visited[r][c] = true;
        int[][] directs = new int[][] {
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0}
        };
        for (int[] direct : directs) {
            int nr = direct[0] + r;
            int nc = direct[1] + c;
            dfs(grid, visited, nr, nc);
        }
    }

}
