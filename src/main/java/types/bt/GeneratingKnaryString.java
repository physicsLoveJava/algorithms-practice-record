package types.bt;

import java.util.Arrays;

public class GeneratingKnaryString {

    public void generate(int n, int k) {
        int[] arr = new int[n];
        System.out.println("generating k-nary string of : " + n);
        generate(arr, n - 1, k);
    }

    private void generate(int[] arr, int n, int k) {
        if(n < 0) {
            System.out.println(Arrays.toString(arr));
        }else {
            for (int i = 0; i < k; i++) {
                arr[n] = i;
                generate(arr, n - 1, k);
            }
        }
    }

}
