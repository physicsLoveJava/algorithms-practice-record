package types.dp;

import org.apache.commons.lang3.ArrayUtils;
import util.PrintUtils;

public class LongMonotoneSubSequence {

    public static int find(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }
        char[] chars = str.toCharArray();
        int[] dp = new int[chars.length];
        dp[0] = 1;
        int res = dp[0];
        for (int i = 1; i < chars.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                int cmp = chars[j] - chars[i];
                if(cmp <= 0 && max < dp[j]) {
                    max = dp[j];
                }
            }
            dp[i] = max + 1;
            if(res < dp[i]) {
                res = dp[i];
            }
        }
//        PrintUtils.println(ArrayUtils.toObject(chars));
//        PrintUtils.println(ArrayUtils.toObject(dp));
//        System.out.println();
        return res;
    }

    public static String findWithSeq(String str) {
        if(str == null || str.length() == 0) {
            return "";
        }
        char[] chars = str.toCharArray();
        int[] dp = new int[chars.length];
        dp[0] = 1;
        for (int i = 1; i < chars.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if(chars[j] <= chars[i]
                        && max < dp[j]) {
                    max = dp[j];
                }
            }
            dp[i] = max + 1;
        }
        char[] result = new char[dp[chars.length - 1]];
        int count = result.length - 1;
        while(count > 0) {
            if(count == result.length - 1) {
//                result[count] =
            }
        }
        return new String(result);
    }



}
