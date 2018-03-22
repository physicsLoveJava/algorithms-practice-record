package leetcode.contest.c1;

import java.util.Scanner;

public class ConstructPalinrome {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            System.out.println(construct(str));
        }

    }

    private static int construct(String str) {
        int[][] dp = new int[str.length() + 1][str.length() + 1];
        return str.length() - constructPalindrome(dp, str, 0, str.length() - 1);
    }

    private static int constructPalindrome(int[][] dp, String str, int start, int end) {
        if(start > end || start > str.length() - 1 || end < 0) {
            return 0;
        }
        if(start == end) {
            return dp[start][end] = 1;
        }
        if(dp[start][end] != 0) {
            return dp[start][end];
        }
        if(str.charAt(start) == str.charAt(end)) {
            dp[start][end] = 2 + constructPalindrome(dp, str, start + 1, end - 1);
        }else {
            dp[start][end] = Math.max(
                    constructPalindrome(dp, str, start + 1, end),
                    constructPalindrome(dp, str, start, end - 1)
            );
        }
        return dp[start][end];
    }

}
