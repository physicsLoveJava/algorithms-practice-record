package types.string;

import java.util.Arrays;

import static org.apache.commons.lang3.ArrayUtils.swap;

public class StringPermutation {

    public void permutation(int[] arr) {
        Arrays.sort(arr);
        permutation(arr, 0, arr.length - 1);
    }

    private void permutation(int[] arr, int s, int e) {
        if(s == e) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = s; i <= e; i++) {
            if(i == s || arr[i] != arr[i - 1]) {
                swap(arr, i, s);
                permutation(arr, s + 1, e);
                swap(arr, i, s);
            }
        }
    }

}
