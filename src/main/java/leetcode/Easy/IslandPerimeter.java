package leetcode.Easy;

/**
 * Problem Url: https://leetcode.com/problems/island-perimeter
 */
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int p = 0;
        int overlap = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    p += 4;
                    overlap +=
                        overlap(grid, i + 1, j)
                        + overlap(grid, i, j + 1)
                        + overlap(grid, i - 1, j)
                        + overlap(grid, i, j - 1);
                }
            }
        }
        return p - overlap;
    }

    private int overlap(int[][] grid, int i, int j) {
        if(i < 0 || i > grid.length - 1
                || j < 0 || j > grid[0].length - 1) {
            return 0;
        }
        return grid[i][j];
    }

}
