package types.bt;

public class FindRegionInMatrix {

    private int max = 0;

    public int findMaxRegion(int[][] matrix) {
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1) {
            return -1;
        }
        int[][] visited = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                findMaxRegionRecursive(matrix, i, j, visited, 0);
            }
        }
        return max;
    }

    private void findMaxRegionRecursive(int[][] matrix, int i, int j, int[][] visited, int size) {
        if(i < 0 || i > matrix.length - 1
            || j < 0 || j > matrix[0].length - 1) {
            return;
        }
        if(matrix[i][j] != 1) {
            return;
        }
        visited[i][j] = 1;
        size++;
        if(max < size) {
            max = size;
        }
        int[][] directs = new int[][] {
                {1, 1}, {1, -1}, {1, 0},
                {0, 1}, {0, -1},
                {-1, 1}, {-1, -1}, {-1, 0}
        };
        for (int dir = 0; dir < directs.length; dir++) {
            int nR = directs[dir][0] + i;
            int nC = directs[dir][1] + j;
            int val = isRegion(matrix, nR, nC, visited);
            if(val == 1 && visited[nR][nC] == 0) {
                findMaxRegionRecursive(matrix, nR, nC, visited, size);
            }
        }
        visited[i][j] = 0;
    }

    private int isRegion(int[][] matrix, int nR, int nC, int[][] visited) {
        if(nR < 0 || nR > matrix.length - 1
                || nC < 0 || nC > matrix[0].length - 1 || visited[nR][nC] == 1) {
            return 0;
        }
        return 1;
    }

}
