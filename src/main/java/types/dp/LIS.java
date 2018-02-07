package types.dp;

public class LIS {

    public static int find(int[] array) {

        int[] dp = new int[array.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < i; j++) {
                if(array[j] < array[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < dp.length; i++) {
            if(max < dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }

}
