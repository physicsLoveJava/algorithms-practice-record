package types.string;

import static org.apache.commons.lang3.ArrayUtils.swap;

public class StringPermutationRecursion {

    public void permutation(int[] arr) {
        while (true) {
            int idx = -1;
            for (int i = arr.length - 1; i > 0; i--) {
                if(arr[i] > arr[i - 1]) {
                    idx = i - 1;
                    break;
                }
            }
            if(idx == -1) {
                break;
            }
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for (int i = idx; i < arr.length - 1; i++) {
                if(arr[i] < min) {
                    minIdx = i;
                    min = arr[i];
                }
            }
            swap(arr, idx, minIdx);
            reverse(arr, idx + 1, arr.length - 1);
        }
    }

    private void reverse(int[] arr, int s, int e) {
        while(s < e) {
            int tmp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = tmp;
        }
    }

}
