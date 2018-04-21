package types.dp;

public class PartitionProblem {

    public int partition(int[] arr, int k) {
        int[][] dp = new int[arr.length + 1][k + 1];
        return find(arr, dp, arr.length - 1, k);
    }

    private int find(int[] arr, int[][] dp, int range, int k) {
        if(dp[range][k] != 0) {
            return dp[range][k];
        }
        if(range == 0) {
            return dp[range][k] = arr[0];
        }
        if(k == 1) {
            return dp[range][k] = getSum(arr, 0, range);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < range; i++) {
            if(k > 1) {
                min = Math.min(min,
                        Math.max(find(arr, dp, i, k - 1), getSum(arr, i + 1, range)));
            }
        }
        return dp[range][k] = min;
    }

    private int getSum(int[] arr, int s, int e) {
        int sum = 0;
        for (int i = s; i <= e; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
