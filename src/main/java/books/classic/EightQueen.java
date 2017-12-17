package books.classic;

public class EightQueen {

    private static int[] queens;

    public static void find(int size) {
        queens = new int[size];
        queen(0);
    }

    private static void queen(int idx) {
        if(promising(idx)) {
            if(idx == queens.length - 1) {
                printQueen();
                return;
            }
            for (int i = 0; i < queens.length; i++) {
                queens[idx + 1] = i;
                queen(idx + 1);
            }
        }
    }

    private static void printQueen() {
        System.out.println("solution:");
        for (int i = 0; i < queens.length; i++) {
            for (int j = 0; j < queens.length; j++) {
                if(queens[i] == j) {
                    System.out.printf("%2d", 1);
                }else {
                    System.out.printf("%2d", 0);
                }
            }
            System.out.println();
        }
    }

    private static boolean promising(int idx) {
        int k = 0;
        while(k < idx) {
            if(queens[k] == queens[idx]
                    || Math.abs(queens[idx] - queens[k]) == idx - k) {
                return false;
            }
            k++;
        }
        return true;
    }

}
