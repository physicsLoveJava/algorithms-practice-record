package leetcode.contest.c4;

import java.util.Scanner;

public class NumberPair {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        for (int y = k + 1; y <= n; y++) {
            if (n % y < k) {
                sum = sum + n / y * (y - k);
            } else {
                sum = sum + n / y * (y - k) + n % y - k + 1;
            }
        }
        System.out.println(sum);
    }

}
