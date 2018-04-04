package books.wialgorithms.sort;

import static org.apache.commons.lang3.ArrayUtils.swap;

public class InsertionSort {

    public static void sort(int[] arr) {
        if(arr == null) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            insert(arr, i, arr[i]);
        }
    }

//    private static void insert(int[] arr, int pos, int val) {
//        int i = pos - 1;
//        while(i >= 0 && arr[i] > arr[i + 1]) {
//            arr[i + 1] = arr[i];
//            i--;
//        }
//        arr[i + 1] = val;
//    }

    private static void insert(int[] arr, int pos, int val) {
        int i = pos - 1;
        while(i >= 0 && arr[i] > arr[i + 1]) {
            swap(arr, i, i + 1);
            i--;
        }
    }

}
