package company.huawei.c2;

import java.util.Scanner;

public class JumpGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println(minimalJump(arr));
        }

    }

    private static int minimalJump(int[] arr) {
        int[] dp = new int[arr.length];
        return compute(dp, arr, 0);
    }

    private static int compute(int[] dp, int[] arr, int idx) {
        if(idx >= arr.length - 1) {
            return 0;
        }
        if(dp[idx] != 0) {
            return dp[idx];
        }
        int p = arr[idx];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= p; i++) {
            min = Math.min(min, compute(dp, arr, i + idx) + 1);
        }
        return dp[idx] = min;
    }

}
