package company.microsoft.c9;

import java.util.Scanner;

public class LegendaryItem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(expectation(p, q, 0, n, 0, 1));
    }

    private static double expectation(int p, int q, int cur, int n, int level, double base) {
        System.out.println("p = [" + p + "], q = [" + q + "], cur = [" + cur + "], n = [" + n + "], level = [" + level + "], base = [" + base + "]");
        if(cur == n) {
            System.out.println("xx:" + level + "*" + base + "=" + level * base);
            return level * base;
        }
        if(p >= 100) {
            return expectation(100 / (int) Math.pow(2, cur + 1), q, cur + 1, n, level + 1, base * 1);
        }
        return expectation(p, q, cur + 1, n, level + 1, base * base * ((double)p / 100)) +
                expectation(1 - p + q, q, cur, n, level + 1, (p + q >= 100 ? base : ( base * base * (double)(p + q) / 100)));
    }

}
