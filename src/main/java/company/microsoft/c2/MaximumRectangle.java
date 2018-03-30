package company.microsoft.c2;

import java.util.Scanner;

public class MaximumRectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int m = scanner.nextInt();
            int o = scanner.nextInt();
            int p = scanner.nextInt();
            int max = computeMax(m, o, p);
            System.out.printf("Case #%s: %s\n", i + 1, max);
        }
    }

    private static int computeMax(int m, int o, int p) {
        if(p < 4) {
            return 0;
        }
        if(p == m * o) {
            return dAvg(m) * dAvg(o);
        }
        int max = 0;
        int low = Math.min(m, o);
        int up = Math.max(m, o);
        for (int i = 2; i < p; i++) {
            int q = p / i;
            if(i <= low && up >= q) {
                int t = p % i;
                int tmp;
                if(t == 0) {
                    tmp = dAvg(i) * dAvg(q);
                }else {
                    tmp = dAvg(i) * dAvg(q) + dAvg(q + 1) * dAvg(t) - dAvg(q) * dAvg(t);
                }
                if(max < tmp) {
                    max = tmp;
                }
            }
        }
        return max;
    }

    private static int dAvg(int o) {
        return o * (o - 1) / 2;
    }

}
