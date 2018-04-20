package types.dp;

import java.util.Arrays;

public class LongestIncreasingSubsequence_1 {

    public int find(int[] arr) {
        int[] dp = new int[arr.length];
        int[] path = new int[arr.length];
        Arrays.fill(dp, 1);
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[j] < arr[i]) {
                    if(dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        path[i] = j;
                    }
                }
            }
            max = Math.max(dp[i], max);
        }
        int idx = -1;
        for (int i = dp.length - 1; i >= 0 ; i--) {
            if(dp[i] == max) {
                idx = i;
            }
        }
        showPath(arr, dp, path, max, idx);
        return max;
    }

    private void showPath(int[] arr, int[] dp, int[] path, int max, int idx) {
        if(max > 0) {
            if(max == 1) {
                System.out.printf("%s", arr[idx]);
            }else {
                System.out.printf("%s -> ", arr[idx]);
            }
            showPath(arr, dp, path, max - 1, path[idx]);
        }else {
            System.out.println();
        }
    }

}
