package hackerrank;

import java.util.Scanner;

/**
 * Problem Url: https://www.hackerrank.com/challenges/sherlock-and-cost/problem
 */
public class SherlockAndCost {

    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        for (int i = 0; i < queries; i++) {
            int n = in.nextInt();
            int[] bArr = new int[n];
            for (int j = 0; j < n; j++) {
                bArr[j] = in.nextInt();
            }
            System.out.println(sherlockCost(bArr));
        }

    }

    public static int sherlockCost(int[] bArr) {
        if(bArr.length < 2) {
            return 0;
        }
        //dp[i][0] take a[i] -> 1
        //dp[i][1] take a[i] -> bi
        int[][] dp = new int[bArr.length][2];
        for (int i = 1; i < bArr.length; i++) {
            int next = Math.abs(bArr[i] - 1);
            int prev = Math.abs(bArr[i - 1] - 1);
            dp[i][0] = Math.max(dp[i][0], prev + dp[i - 1][1]);
            dp[i][1] = Math.max(dp[i][1], next + dp[i - 1][0]);
            dp[i][1] = Math.max(dp[i][1], Math.abs(bArr[i] - bArr[i - 1]) + dp[i - 1][1]);
        }
        return Math.max(dp[bArr.length - 1][0], dp[bArr.length - 1][1]);
    }
}
