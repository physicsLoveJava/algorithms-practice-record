package company.microsoft.c1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongRepeatedSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(maxLongRepeated(arr));
    }

    private static int maxLongRepeated(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            List<Integer> sameList = new ArrayList<>();
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    sameList.add(j);
                }
            }
            for (Integer next : sameList) {
                int k = 1;
                while (i + k < next && next + k < arr.length && arr[i + k] == arr[next + k]) {
                    k++;
                }
                if (k > max) {
                    max = k;
                }
            }
        }
        return max;
    }

    public static class Test1 {
        public static void main(String[] args) {

            System.out.println(maxLongRepeated(new int[]{
                    2, 3, 2, 3, 2
            }));

            System.out.println(maxLongRepeated(new int[]{
                    1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 4, 5, 6, 7, 8
            }));

            System.out.println(maxLongRepeated(new int[]{
                    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 10
            }));

        }
    }

}
