package books.classic;

public class GameOfLife {

    private static int DEAD = 1;
    private static int ALIVE = 2;
    private static int REBORN = 3;

    public static void start(int[][] matrix, int rows, int cols) throws InterruptedException {

        if(matrix == null || rows < 0 || cols < 0) {
            return ;
        }

        int[][] map = new int[rows][cols];

        while(true) {
            printMatrix(matrix, rows, cols);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    switch (getNeighbours(matrix, i, j)) {
                        case 0:
                        case 1:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            map[i][j] = DEAD;
                            break;
                        case 2:
                            map[i][j] = ALIVE;
                            break;
                        case 3:
                            map[i][j] = REBORN;
                            break;
                    }
                }
            }
            transformMatrix(matrix, map);
            Thread.sleep(1000);
        }

    }

    private static void transformMatrix(int[][] matrix, int[][] map) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                switch (map[i][j]) {
                    case 1:
                        matrix[i][j] = 0;
                        break;
                    case 2:
                        break;
                    case 3:
                        matrix[i][j] = 1;
                        break;
                    default:
                            break;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix, int rows, int cols) {
        System.out.println("matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 1) {
                    System.out.printf("%2s", "X");
                }else {
                    System.out.printf("%2s", "0");
                }
            }
            System.out.println();
        }
    }

    private static int getNeighbours(int[][] matrix, int row, int col) {
        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = row - 1; i < row + 2; i++) {
            for (int j = col - 1; j < col + 2; j++) {
                if(i < 0 || j < 0 || i >= rows || j >= cols
                        || (i == row && j == col)) {
                    continue;
                }else {
                    if(matrix[i][j] == 1) {
                        count ++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 1, 1, 1},
                {0, 1, 0, 1},
                {1, 1, 1, 1},
                {0, 0, 1, 1}
        };

        System.out.println(getNeighbours(matrix, 0, 0));

    }

}
