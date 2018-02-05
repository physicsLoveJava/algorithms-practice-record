package types.dp;

public class MaximumValueContiguousSequenceWihtoutTwo {

    public static int find(int[] arr) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        int[] m = new int[arr.length + 1];
        int max = 0;
        for (int i = 1; i < m.length; i++) {
            m[i] = Math.max(
                    arr[i - 1] + (i > 2 ? m[i - 2] : 0),
                    m[i - 1]
            );
            if(m[i] > max) {
                max = m[i];
            }
        }
        return max;
    }
}
