package types.bt;

import java.util.Arrays;

public class GeneratingBinaryString {

    public void generate(int n) {
        int[] arr = new int[n];
        System.out.println("generating binary string of : " + n);
        generate(arr, n - 1);
    }

    private void generate(int[] arr, int n) {
        if(n < 0) {
            System.out.println(Arrays.toString(arr));
        }else {
            arr[n] = 0;
            generate(arr, n - 1);
            arr[n] = 1;
            generate(arr, n - 1);
        }
    }

}
