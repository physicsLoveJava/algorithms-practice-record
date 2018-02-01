package types.dp;

public class LongMonotoneSubSequence {

    public static int find(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }
        char[] chars = str.toCharArray();
        int[] dp = new int[chars.length];
        dp[0] = 1;
        for (int i = 1; i < chars.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                int cmp = chars[j] - chars[i];
                if(cmp <= 0 && max < dp[j]) {
                    max = dp[j];
                }
            }
            dp[i] = max + 1;
        }
        return dp[chars.length - 1];
    }

}
