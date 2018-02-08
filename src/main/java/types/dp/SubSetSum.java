package types.dp;

import util.PrintUtils;

public class SubSetSum {

    static int[][] dp;

    public static boolean find(int[] array, int sum) {
        dp = new int[array.length][sum + 1];
        int findx = findx(array, array.length - 1, sum);
        PrintUtils.printMatrix(dp, 2);
        printPath(array, sum, dp);
        return findx == sum;
    }

    private static void printPath(int[] array, int sum, int[][] dp) {
        int len = array.length - 1;
        int curS = sum;
        while(len >= 0) {
            if(len == 0) {
                if(dp[len][curS] == array[0]) {
                    System.out.println("selected: " + array[len]);
                }
                len = len - 1;
                continue;
            }
            if(curS >= array[len] && dp[len][curS] == dp[len - 1][curS - array[len]] + array[len]) {
                System.out.println("selected: " + array[len]);
                curS -= array[len];
            }
            len = len - 1;
        }
    }

    private static int findx(int[] array, int end, int sum) {
        if(sum < 0 || end < 0) {
           return 0;
        }else {
            if(dp[end][sum] != 0) {
                return dp[end][sum];
            }
            if(end == 0) {
                dp[end][sum] = array[0] <= sum ? array[0] : 0;
            }else if(sum > array[end]) {
                dp[end][sum] = Math.max(
                        findx(array, end - 1, sum),
                        findx(array, end - 1, sum - array[end]) + array[end]
                );
            }else {
                dp[end][sum] = findx(array, end -1, sum);
            }
        }
        return dp[end][sum];
    }

}
