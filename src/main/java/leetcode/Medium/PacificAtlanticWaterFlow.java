package leetcode.Medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * Problem Url: https://leetcode.com/problems/pacific-atlantic-water-flow
 */
public class PacificAtlanticWaterFlow {

    public List<int[]> pacificAtlantic(int[][] matrix) {
        List<int[]> rs = new LinkedList<>();
        if(matrix == null || matrix.length == 0) {
            return rs;
        }
        int[][] state = new int[matrix.length][matrix[0].length];
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(state[i][j] == 0) {
                    state[i][j] = dfs(matrix, state, visited, i, j);
                }
            }
        }
        for (int i = 0; i < state.length; i++) {
            for (int j = 0; j < state[0].length; j++) {
                if(state[i][j] == 3) {
                    rs.add(new int[] {i, j});
                }
            }
        }
        return rs;
    }

    static int[][] directs = new int[][] {
            {0, 1},
            {0, -1},
            {1, 0},
            {-1, 0}
    };

    private int dfs(int[][] matrix, int[][] state, boolean[][] visited, int i, int j) {
        if(visited[i][j] || state[i][j] != 0) {
            return state[i][j];
        }
        int old = 0;
        if(i == 0 && j == matrix[0].length -1) {
            old = 3;
        }else if(i == matrix.length - 1 && j == 0) {
            old = 3;
        }else if(i == matrix.length - 1 || j == matrix[0].length - 1) {
            old = 2;
        }else if(i == 0 || j == 0) {
            old = 1;
        }
        visited[i][j] = true;
        Set<Integer> max = new HashSet<>();
        int newVal = -1;
        for (int[] direct : directs) {
            int ni = direct[0] + i;
            int nj = direct[1] + j;
            if(rangeCheck(matrix, ni, nj) && !visited[ni][nj] && matrix[ni][nj] <= matrix[i][j]) {
                int tmp;
                if(state[ni][nj] == 0) {
                    tmp = dfs(matrix, state, visited, ni, nj);
                }else {
                    tmp = state[ni][nj];
                }
                max.add(tmp);
            }
        }
        visited[i][j] = false;
        if(max.contains(3)) {
            newVal = 3;
        }else if(max.contains(2) && max.contains(1)) {
            newVal = 3;
        }else if(max.contains(2)) {
            newVal = 2;
        }else if(max.contains(1)) {
            newVal = 1;
        }
        return Math.max(old, newVal);
    }

    private boolean rangeCheck(int[][] matrix, int i, int j) {
        return !(i < 0 || i > matrix.length - 1 || j < 0 || j > matrix[0].length - 1);
    }

}
