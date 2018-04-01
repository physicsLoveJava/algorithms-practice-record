package company.microsoft.c8;

import java.util.Scanner;

public class LostInCity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        char[][] matrix = new char[n][m];
        char[][] surround = new char[3][3];
        for (int i = 0; i < n; i++) {
            String next = scanner.next();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = next.charAt(j);
            }
        }
        for (int i = 0; i < 3; i++) {
            String next = scanner.next();
            for (int j = 0; j < 3; j++) {
                surround[i][j] = next.charAt(j);
            }
        }
        findPosition(matrix, surround);
    }

    private static void findPosition(char[][] matrix, char[][] surround) {
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[0].length - 1; j++) {
                if(matrix[i][j] == surround[1][1]) {
                    if(isRotate(matrix, i, j, surround)) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }

    private static boolean isRotate(char[][] matrix, int i, int j, char[][] surround) {
        return false;
    }

}
