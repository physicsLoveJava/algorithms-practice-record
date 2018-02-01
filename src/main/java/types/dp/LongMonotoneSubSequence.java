package types.dp;

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
        int res = dp[0];
        int k = 0;
        for (int i = 1; i < chars.length; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if(chars[j] <= chars[i]
                        && max < dp[j]) {
                    max = dp[j];
                }
            }
            dp[i] = max + 1;
            if(res < dp[i]) {
                res = dp[i];
                k = i;
            }
        }
//        System.out.println(res);
//        System.out.println(k);
//        PrintUtils.println(ArrayUtils.toObject(chars));
//        PrintUtils.println(ArrayUtils.toObject(dp));
//        System.out.println();
        char[] result = new char[res];
        int count = result.length - 1;
        int tmp = -1;
        while(count >= 0) {
            if(count == result.length - 1) {
                result[count--] = chars[k];
                tmp = k;
                k--;
            }else {
                if(dp[k] - dp[tmp] == -1) {
                    result[count--] = chars[k];
                    tmp = k;
                    k--;
                }else {
                    k--;
                }
            }
        }
        return new String(result);
    }



}
