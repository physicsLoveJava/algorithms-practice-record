package leetcode.Medium;

import util.PrintUtils;

/**
 * Problem Url: https://leetcode.com/problems/arithmetic-slices
 */
public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] arr) {
        if(arr == null || arr.length < 3) {
            return 0;
        }
        Boolean[][] dp = new Boolean[arr.length][arr.length];
        int count = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = dp.length - 1; j - i >= 2; j--) {
                if(rangeCheck(dp, i, j + 1) && isTrue(dp, i, j + 1)) {
                    dp[i][j] = true;
                    count++;
                    continue;
                }
                if(rangeCheck(dp, i - 1, j) && isTrue(dp, i - 1, j)) {
                    dp[i][j] = true;
                    count++;
                    continue;
                }
                dp[i][j] = isArithmetic(arr, i, j);
                if(isTrue(dp, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isTrue(Boolean[][] dp, int l, int r) {
        return dp[l][r] != null && dp[l][r];
    }

    private boolean rangeCheck(Boolean[][] dp, int l, int r) {
        return l >= 0 && l < dp.length && r >=0 && r < dp.length
                && r - l >= 2;
    }

    private Boolean isArithmetic(int[] arr, int row, int col) {
        if(col - row < 2) {
            return false;
        }
        int temp = arr[row + 1] - arr[row];
        for (int i = row; i < col; i++) {
            if(arr[i + 1] - arr[i] != temp) {
                return false;
            }
        }
        return true;
    }

}
