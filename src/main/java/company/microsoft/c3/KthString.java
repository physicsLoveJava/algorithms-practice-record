package company.microsoft.c3;

import java.util.Scanner;

public class KthString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(compute(n, m, k));
        }


    }

    private static String compute(int n, int m, int k) {
        int[][] dp = new int[n + 1][m + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if(i == 0 || j == 0) {
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if(k > dp[n][m]) {
            sb.append("Impossible");
            return sb.toString();
        }
        while(k > 0 && m >= 0 && n > 0) {
            if(k > dp[n - 1][m]) {
                sb.append("1");
                k -= dp[n - 1][m];
                m = m - 1;
            }else {
                sb.append("0");
                n = n - 1;
            }
        }
        if(m > 0) {
            sb.append("1");
            m--;
        }
        return sb.toString();
    }

}
