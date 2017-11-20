package offer.sort;

import java.util.Comparator;

public class InsertionSort {

    public static <E extends Comparable> void sort(E[] arr, Comparator<E> comparator) {
        if(arr == null) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            while(j >= 0 && comparator.compare(arr[j + 1], arr[j]) < 0) {
                swap(arr, j, j + 1);
                j--;
            }
        }
    }

    private static <E extends Comparable> void copy(E[] arr, int source, int target) {
        arr[target] = arr[source];
    }

    private static <E extends Comparable> void swap(E[] arr, int source, int target) {
        E tmp = arr[source];
        arr[source] = arr[target];
        arr[target] = tmp;
    }


}
