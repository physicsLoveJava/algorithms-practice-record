package leetcode.contest.c5;

import java.util.Scanner;

public class NumberMultiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(maximum(n));
    }

    private static int maximum(int n) {
        if(n < 1) {
            return 0;
        }
        int[] dp = new int[n + 1];
        return computeMaximum(dp, n);
    }

    private static int computeMaximum(int[] dp, int n) {
        if(n < 1) {
            return 1;
        }
        if(dp[n] != 0) {
            return dp[n];
        }
        if(n == 1) {
            return dp[1] = 1;
        }
        int max = 1;
        for (int i = 1; i < n; i++) {
            int tmp = i * Math.max(n - i, computeMaximum(dp, n - i));
            if(tmp > max) {
                max = tmp;
            }
        }
        return dp[n] = max;
    }

}
