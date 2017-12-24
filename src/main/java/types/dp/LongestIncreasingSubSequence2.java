package types.dp;

import org.apache.commons.lang3.ArrayUtils;
import util.PrintUtils;

public class LongestIncreasingSubSequence2 {

    public static int find(int[] seq) {
        if(seq == null) {
            return 0;
        }
        int[] res = new int[seq.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = 1;
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < i; j++) {
                if(seq[j] < seq[i]) {
                    //seq[j]如果在子队列中，则更新当前可能的res[i]
                    res[i] = Math.max(res[i], res[j] + 1);
                }
            }
        }
        int max = 1;
        for (int i = 0; i < res.length; i++) {
            if(max < res[i]) {
                max = res[i];
            }
        }
        return max;
    }

}
