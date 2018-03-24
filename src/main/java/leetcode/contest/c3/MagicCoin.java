package leetcode.contest.c3;

import java.util.Scanner;

public class MagicCoin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(compute(n));

    }

    private static String compute(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0) {
            if((n % 2) == 0) {
                n = (n / 2) - 1;
                sb.insert(0, '2');
            }else {
                n = (n - 1) / 2;
                sb.insert(0, '1');
            }
        }
        return sb.toString();
    }

}
