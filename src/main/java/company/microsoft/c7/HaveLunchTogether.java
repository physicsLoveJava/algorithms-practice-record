package company.microsoft.c7;

import util.PrintUtils;

import java.util.Scanner;

public class HaveLunchTogether {

    static int count = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = -1, c = -1;
        String[][] matrix = new String[n][m];
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            String next = scanner.next();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = String.valueOf(next.charAt(j));
                if(matrix[i][j].equals("H")) {
                    r = i;
                    c = j;
                }else if(matrix[i][j].equals("S")) {
                    dp[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(dp[i][j] == 1) {
                    dp[i][j] = dfs(matrix, new boolean[n][m], i, j, r, c, 0);
                    System.out.println(i +":" + j + ":" + dp[i][j]);
                }
            }
        }
        PrintUtils.printMatrix(dp);
    }

    static int[][] directs = new int[][] {
            {1, 0},
            {-1, 0},
            {0, 1},
            {0, -1}
    };

    private static int dfs(String[][] matrix, boolean[][] visited, int r, int c, int nr, int nc, int count) {
        if(visited[r][c]) {
            return -1;
        }

        if(r == nr && c == nc) {
            return count;
        }
        int max = -1;
        visited[r][c] = true;
        for (int[] direct : directs) {
            int xr = r + direct[0];
            int xc = c + direct[1];
            if(rangeCheck(matrix, xr, xc) && matrix[xr][xc].equals(".") && !visited[xr][xc]) {
                int tmp = dfs(matrix, visited, xr, xc, nr, nc, count + 1);
                if(tmp > max) {
                    max = tmp;
                }
            }
        }
        return max;
    }

    private static boolean rangeCheck(String[][] matrix, int xr, int xc) {
        return !(xr < 0 || xr > matrix.length - 1 || xc < 0 || xc > matrix[0].length - 1);
    }

}
