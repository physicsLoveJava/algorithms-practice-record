package leetcode.Easy;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/flood-fill
 */
public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image == null || image.length == 0) {
            return image;
        }
        int[][] rs = new int[image.length][image[0].length];
        for (int[] row : rs) {
            Arrays.fill(row, -1);
        }
        dfs(image, rs, sr, sc, newColor);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if(rs[i][j] == -1) {
                    rs[i][j] = image[i][j];
                }
            }
        }
        return rs;
    }

    private void dfs(int[][] image, int[][] rs, int sr, int sc, int newColor) {
        if(!rangeCheck(image, sr, sc)) {
            return;
        }
        if(rs[sr][sc] != -1) {
            return;
        }
        int[][] directs = new int[][] {
                {0, -1},
                {-1, 0},
                {0, 1},
                {1, 0}
        };
        for (int[] direct : directs) {
            int nr = direct[0] + sr;
            int nc = direct[1] + sc;
            if(rangeCheck(image, nr, nc) && image[sr][sc] == image[nr][nc]) {
                dfs(image, rs, nr, nc, newColor);
            }
        }
        rs[sr][sc] = newColor;
    }

    private boolean rangeCheck(int[][] image, int sr, int sc) {
        return !(sr < 0 || sr > image.length - 1
                || sc < 0 || sc > image[0].length - 1);
    }

}
