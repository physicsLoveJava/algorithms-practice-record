package company.netease.c2;

import java.util.Scanner;

public class IntersectRectangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p1 = new int[n];
        int[] p2 = new int[n];
        int[] t1 = new int[n];
        int[] t2 = new int[n];
        for (int i = 0; i < n; i++) {
            p1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            p2[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t2[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            int rcount = 0;
            for (int j = 0; j < n; j++) {
                if(p1[j] >= p2[i] || p2[j] <= p1[i]
                    || t1[j] >= t2[i] || t2[j] <= t1[i]) {
                }else {
                    rcount ++;
                }
            }
            count = Math.max(count, rcount);
        }
        System.out.println(count);
    }

}
