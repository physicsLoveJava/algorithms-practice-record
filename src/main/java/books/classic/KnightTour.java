package books.classic;

//TODO
public class KnightTour {

    private static int[][] board;
    private static int size = 8;

    public static void move(int x, int y) {
        board = new int[size][size];
        if(!travel(x, y)) {
            System.out.println("can't travel the whole chessboard!");
        }else {
            printChessBoard(board, size);
        }
    }

    private static void printChessBoard(int[][] board, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%2d", board[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean travel(int x, int y) {
        int[] xmove = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] ymove = {-1, 1, -2, 2, -2, 2, 1, -1};

        int[] nxmove = new int[size];
        int[] nymove = new int[size];

        int[] counts = new int[8];
        int a = x;
        int b = y;
        board[a][b] = 1;

        for (int m = 2; m <= size * size; m++) {
            for (int i = 0; i < size; i++) {
                counts[i] = 0;
            }

            int l = 0;
            int min = 0;
            int ta = 0;
            int tb = 0;

            //试探8个方向
            for (int i = 0; i < 8; i++) {
                ta = a + xmove[i];
                tb = b + ymove[i];

                if (ta < 0 || ta > 7
                        || tb < 0 || tb > 7) {
                    continue;
                }

                if (board[ta][tb] == 0) {
                    nxmove[i] = ta;
                    nymove[i] = tb;
                    l++;
                }
            }

            int count = l;
            if(count == 0) {
                return false;
            }else if(count == 1) {
                min = 0;
            }else {
                    //找出下一个位置的出路数
                    for(l=0; l < count; l++){
                        for(int k = 0; k < 8 ; k++){
                            ta = nxmove[l]+xmove[k];
                            tb = nymove[l]+ymove[k];
                            if(ta<0||tb<0||
                                    ta>7||tb>7){
                                continue;
                            }
                            if(board[ta][tb]==0)
                                counts[l]++;
                        }
                    }
                    int tmp = counts[0];
                    min=0;
                    // 从可走的方向中寻找最少出路的方向
                    for(l=1;l<count;l++){
                        if(counts[l]<tmp){
                            tmp = counts[l];
                            min = l;
                        }
                    }
                }
                // 走最少出路的方向
                a = nxmove[min];
                b = nymove[min];
                board[a][b] = m;
            }

            return true;
        }

}
