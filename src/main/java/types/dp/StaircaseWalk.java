package types.dp;

public class StaircaseWalk {

    public static int walk(int rows, int cols) {
        if(rows < 1 || cols < 1) {
            return 0;
        }

        int[][] count = new int[rows][cols];

        count[rows - 1][cols - 1] = 1;
        for (int i = rows - 1; i > -1; i--) {
            for (int j = cols - 1; j > -1; j--) {
                if(count[i][j] == 0) {
                    count[i][j] = 0;
                    if(j + 1 <= cols - 1) {
                        count[i][j] += count[i][j + 1];
                    }
                    if(i + 1 <= rows - 1) {
                        count[i][j] += count[i + 1][j];
                    }
                }
            }
        }
        return count[0][0];
    }

}
