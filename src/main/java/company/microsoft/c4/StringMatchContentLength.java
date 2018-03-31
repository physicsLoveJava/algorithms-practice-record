package company.microsoft.c4;

import java.util.Scanner;

public class StringMatchContentLength {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String t = scanner.next();
        System.out.println(maxContentLength(s, t));

    }

    private static int maxContentLength(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                dp[i][j] = s.charAt(i) == t.charAt(j) ? 1 : 0;
            }
        }
        int[][] opt = new int[s.length()][t.length()];
        return findMax(dp, opt,0, 0);
    }

    private static int findMax(int[][] dp, int[][] opt, int s, int t) {
        if(s > dp.length - 1 || t > dp[0].length - 1) {
            return 0;
        }
        if(opt[s][t] != 0) {
            return opt[s][t];
        }

        int max = 0;
        for (int i = s; i < dp.length; i++) {
            for (int j = t; j < dp[0].length; j++) {
                if(dp[i][j] == 1) {
                    int len = findLength(dp, i, j);
                    if(len < 3) {
                        continue;
                    }
                    int subMax = findMax(dp, opt, i + len, j + len) + len;
                    if(max < subMax) {
                        max = subMax;
                    }
                }
            }
        }
        return opt[s][t] = max;
    }

    private static int findLength(int[][] dp, int i, int j) {
        if(i < 0 || i > dp.length - 1 || j < 0 || j > dp[0].length - 1 || dp[i][j] == 0) {
            return 0;
        }
        return 1 + findLength(dp, i + 1, j + 1);
    }

}
