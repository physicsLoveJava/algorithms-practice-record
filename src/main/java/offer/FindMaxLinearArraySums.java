package offer;

public class FindMaxLinearArraySums {

    public static int findWithLoop(int[] array) {
        if(array == null) {
            return -1;
        }
        int sums = 0;
        int pastGreat = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(sums <= 0) {
                sums = array[i];
            }else {
                sums += array[i];
            }
            if(sums > pastGreat) {
                pastGreat = sums;
            }
        }
        return pastGreat;
    }

    public static int find(int[] array) {

        if(array == null) {
            return -1;
        }

        int[][] sums = new int[array.length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sums[i][j] = -1;
            }
        }

        return find(array, sums, 0, array.length - 1);
    }

    private static int find(int[] array, int[][] sums, int start, int end) {
        if(sums[start][end] != -1) {
            return sums[start][end];
        }
        if(start > end) {
            return  -1;
        }
        if(start == end) {
            sums[start][end] = array[start];
            return array[start];
        }
        int val = Integer.MIN_VALUE;
        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end; j++) {
                int max = 0;
                if(i == start && j == end) {
                    for (int k = start; k <= end; k++) {
                        max += array[k];
                    }
                }else {
                    max = find(array, sums, i, j);
                }
                if(max > val) {
                    val = max;
                }
            }
        }
        sums[start][end] = val;
        return sums[start][end];
    }

}
