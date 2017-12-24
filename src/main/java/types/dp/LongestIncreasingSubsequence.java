package types.dp;

public class LongestIncreasingSubsequence {

    public static int find(int[] seq) {
        if(seq == null) {
            return 0;
        }
        int[] res = new int[seq.length];
        for (int i = 0; i < seq.length; i++) {
            res[i] = 1;
        }
        for (int i = 0; i < seq.length; i++) {
            for (int j = i + 1; j < seq.length; j++) {
                if(seq[i] < seq[j]) {
                    //如果seq[i]在子队列中，则更新res[i]
                    res[i] = Math.max(res[j], res[i] + 1);
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
