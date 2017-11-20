package offer.sort;

import java.util.Comparator;

public class MergeSort {

    public static <E extends Comparable> void sort(E[] arr, Comparator<E> comparator) {
        if(arr == null) {
            return ;
        }
        sort(arr, 0, arr.length - 1, comparator);
    }

    private static <E extends Comparable> void sort(E[] arr, int start, int end, Comparator<E> comparator) {
        if(start >= end) {
            return;
        }
        int mid = (end + start) / 2;
        sort(arr, start, mid, comparator);
        sort(arr, mid + 1, end, comparator);
        merge(arr, start, mid, end, comparator);
    }

    private static <E extends Comparable> void merge(E[] arr, int start, int mid, int end, Comparator<E> comparator) {
        Object[] aux = new Object[end - start + 1];
        for (int i = start; i <= end; i++) {
            aux[i - start] = arr[i];
        }
        int i = start;
        int j = mid + 1;
        int k = 0;
        while(i <= mid && j <= end) {
            int cmp = comparator.compare(arr[i], arr[j]);
            if(cmp >= 0) {
                aux[k++] = arr[j++];
            }else {
                aux[k++] = arr[i++];
            }
        }
        while(i > mid && j <= end) {
            aux[k++] = arr[j++];
        }
        while(j > end && i <= mid) {
            aux[k++] = arr[i++];
        }
        for (int l = 0; l < aux.length; l++) {
            arr[start + l] = (E) aux[l];
        }
    }

}
