package types.bt;

public class FindRegionInMatrix2 {

    private int max = 0;

    public int findMaxRegion(int[][] matrix) {
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return -1;
        }
        int[][] visited = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                findMaxRegionRecursive(matrix, i, j, visited);
            }
        }
        return max;
    }

    private void findMaxRegionRecursive(int[][] matrix, int i, int j, int[][] visited) {
        if(i < 0 || i > matrix.length - 1
            || j < 0 || j > matrix[0].length - 1) {
            return;
        }
        if(matrix[i][j] != 1 || visited[i][j] == 1) {
            return;
        }
        int sum = getRegionSum(matrix, i, j, visited);
        if(sum > max) {
            max = sum;
        }
    }

    private int getRegionSum(int[][] matrix, int nR, int nC, int[][] visited) {
        if(nR < 0 || nR > matrix.length - 1
                || nC < 0 || nC > matrix[0].length - 1
                || visited[nR][nC] == 1 || matrix[nR][nC] == 0) {
            return 0;
        }
        visited[nR][nC] = 1;
        int sum = 1;
        int[][] directs = new int[][] {
                {1, 1}, {1, -1}, {1, 0},
                {0, 1}, {0, -1},
                {-1, 1}, {-1, -1}, {-1, 0}
        };
        for (int i = 0; i < directs.length; i++) {
            int row = directs[i][0];
            int col = directs[i][1];
            sum += getRegionSum(matrix, row + nR, col + nC, visited);
        }
        return sum;
    }

    private int isRegion(int[][] matrix, int nR, int nC, int[][] visited) {
        if(nR < 0 || nR > matrix.length - 1
                || nC < 0 || nC > matrix[0].length - 1 || visited[nR][nC] == 1) {
            return 0;
        }
        return 1;
    }

}
