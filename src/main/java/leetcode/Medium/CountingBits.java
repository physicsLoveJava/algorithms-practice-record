package leetcode.Medium;

import java.util.Arrays;

/**
 * Problem Url: https://leetcode.com/problems/counting-bits
 */
public class CountingBits {

    public int[] countBits(int num) {
        if(num < 0) {
            return new int[0];
        }
        if (num == 0) {
            return new int[] {0};
        }
        if (num == 1) {
            return new int[] {0, 1};
        }
        int[] rs = new int[num + 1];
        int[] dp = new int[num + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 0; i <= num; i++) {
            if(dp[i] != -1) {
                rs[i] = dp[i];
            }else {
                int maxBinaryVal = getBinaryMaxVal(i);
                dp[i] = rs[i] = dp[i - maxBinaryVal] + 1;
            }
        }
        return rs;
    }

    private int getBinaryMaxVal(int num) {
        return (int) Math.pow(2, Integer.toBinaryString(num).length() - 1);
    }

}
