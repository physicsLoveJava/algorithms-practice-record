package types.dp;

import org.apache.commons.lang3.ArrayUtils;
import util.PrintUtils;

public class LongestMonotoneSubSequenceWithDifferBound {

    public static int find(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }
        char[] chars = str.toCharArray();
        int[] dp = new int[chars.length];
        for (int i = 0; i < chars.length - 1; i++) {
            int differ = Math.abs(chars[i] - chars[i + 1]);
            dp[i] = i > 0 ? dp[i - 1] : 0;
            if(differ <= 1) {
                dp[i + 1] = dp[i] + 2;
                i += 1;
            }
        }
//        PrintUtils.println(ArrayUtils.toObject(dp));
        return dp[chars.length - 1];
    }

}
