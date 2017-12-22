package types.dp;

public class StaircaseWalk2 {

    public static int walk(int rows, int cols) {

        if(rows < 1 || cols < 1) {
            return 0;
        }

        int[][] counts = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            counts[i][0] = 1;
        }

        for (int i = 0; i < cols; i++) {
            counts[0][i] = 1;
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                counts[i][j] = counts[i][j - 1] + counts[i - 1][j];
            }
        }

        return counts[rows - 1][cols - 1];
    }

}
