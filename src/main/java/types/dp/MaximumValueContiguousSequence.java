package types.dp;

import java.util.Arrays;

public class MaximumValueContiguousSequence {

    public static int find(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        int[] m = new int[arr.length + 1];
        int max = 0;
        for (int i = 1; i < m.length; i++) {
            m[i] = Math.max(m[i - 1] + arr[i - 1], 0);
            if(max < m[i]) {
                max = m[i];
            }
        }
        return max;
    }
}
