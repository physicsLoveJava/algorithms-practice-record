package company.others;

import java.util.Scanner;

public class MaxSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] a1 = new int[n];
            int[] b1 = new int[n];
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                a1[x - 1] = i;
                a[i] = x - 1;
            }
            for (int i = 0; i < n; i++) {
                int x = scanner.nextInt();
                b1[x - 1] = i;
                b[i] = x - 1;
            }
            int max = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if (b1[a[i]] > b1[a[j]] &&
                        a1[b[i]] < a1[b[j]]) {
                        max ++;
                    }
                }
            }
            System.out.println(max);
        }

    }

}
