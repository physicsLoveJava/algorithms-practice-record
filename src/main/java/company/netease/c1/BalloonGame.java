package company.netease.c1;

import java.util.Scanner;

public class BalloonGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int k = scanner.nextInt();
        int t = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int[][] state = new int[n][m];
        for (int i = 0; i < m; i++) {
            dfs(matrix, state, 0, i);
        }
        matrix[k][t] = 0;
        state[k][t] = 0;
        for (int i = 0; i < m; i++) {
            dfs2(matrix, state, 0, i);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int l = 0; l < m; l++) {
                if(state[i][l] == 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void dfs2(int[][] matrix, int[][] state, int x, int y) {
        if(x < 0 || x > matrix.length - 1 || y < 0 || y > matrix[0].length - 1) {
            return;
        }
        if(state[x][y] == 2) {
            return;
        }
        if(matrix[x][y] == 1) {
            state[x][y] = 2;
            dfs2(matrix, state, x, y + 1);
            dfs2(matrix, state, x, y - 1);
            dfs2(matrix, state, x + 1, y);
            dfs2(matrix, state, x - 1, y);
        }
    }

    private static void dfs(int[][] matrix, int[][] state, int x, int y) {
        if(x < 0 || x > matrix.length - 1 || y < 0 || y > matrix[0].length - 1) {
            return;
        }
        if(state[x][y] != 0) {
            return;
        }
        if(matrix[x][y] == 1) {
            state[x][y] = 1;
            dfs(matrix, state, x, y + 1);
            dfs(matrix, state, x, y - 1);
            dfs(matrix, state, x + 1, y);
            dfs(matrix, state, x - 1, y);
        }
    }

}
