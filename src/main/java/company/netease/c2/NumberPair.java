package company.netease.c2;

import java.util.Scanner;

public class NumberPair {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long count = 0;
        for (int i = k + 1; i <= n; i++) {
            long tmp = (n / i) * (i - k);
            if(n % i >= k) {
                tmp += (n % i) - k + 1;
            }
            count += tmp;
            if(k == 0) {
                count--;
            }
        }
        System.out.println(count);
    }

}
