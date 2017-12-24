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

    public static int[] findWithSequence(int[] seq) {
        if(seq == null) {
            return null;
        }
        int[] res = new int[seq.length];
        int[] path = new int[seq.length];
        for (int i = 0; i < seq.length; i++) {
            res[i] = 1;
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < i; j++) {
                if(seq[j] < seq[i]) {
                    if(res[i] < res[j] + 1) {
                        res[i] = res[j] + 1;
                        path[i] = j;
                    }
                }
            }
        }
        int max = 1;
        int idx = -1;
        for (int i = 0; i < res.length; i++) {
            if(max < res[i]) {
                max = res[i];
                idx = i;
            }
        }
        showPath(seq, path, idx, max);
        return path;
    }

    private static void showPath(int[] seq, int[] path, int idx, int max) {
        if(max > 0) {
            if(max == 1) {
                System.out.printf("%d ", seq[idx]);
            }else {
                System.out.printf("%d -> ", seq[idx]);
            }
            showPath(seq, path, path[idx], max - 1);
        }
    }

}
