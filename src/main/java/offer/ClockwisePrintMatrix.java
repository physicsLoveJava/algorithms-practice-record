package offer;

public class ClockwisePrintMatrix {

    public static void print(int[][] matrix, int rows, int cols) {

        if(matrix == null) {
            return;
        }

        int loop = (int) Math.ceil(Math.min(rows, cols) / 2.0);

        for (int i = 0; i < loop; i++) {
            printLoop(matrix, rows, cols, i);
        }
        System.out.println();

    }

    private static void printLoop(int[][] matrix, int rows, int cols, int loop) {
        printTop(matrix, rows, cols, loop);
        printRight(matrix, rows, cols, loop);
        printBottom(matrix, rows, cols, loop);
        printLeft(matrix, rows, cols, loop);
    }

    private static void printLeft(int[][] matrix, int rows, int cols, int loop) {
        if(loop >= Math.min(rows, cols) / 2) {
            return;
        }
        for (int i = rows - 1 - loop; i > loop; i --) {
            printElement(matrix, i, loop);
        }
    }

    private static void printBottom(int[][] matrix, int rows, int cols, int loop) {
        if(loop > Math.min(rows, cols) / 2) {
            return;
        }
        if(loop == Math.min(rows, cols) / 2) {
            printElement(matrix, rows - 1 - loop, cols - 1 - loop);
            return;
        }
        for (int i = cols - 1 - loop; i > loop; i--) {
            printElement(matrix, rows - 1 - loop, i);
        }
    }

    private static void printRight(int[][] matrix, int rows, int cols, int loop) {
        if(loop > cols - 1) {
            return;
        }
        for (int i = loop; i < rows - 1 - loop; i++) {
            printElement(matrix, i, cols - 1 - loop);
        }
    }

    private static void printTop(int[][] matrix, int rows, int cols, int loop) {
        if(loop > rows - 1) {
            return;
        }
        for (int i = loop; i < cols - 1 - loop; i++) {
            printElement(matrix, loop, i);
        }
    }

    private static void printElement(int[][] matrix, int row, int col) {
        System.out.print(matrix[row][col] + ",");
    }

    private static void log(String str) {
        System.out.print(str);
    }

}
