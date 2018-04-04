package books.wialgorithms.sort;

import java.util.Random;

import static org.apache.commons.lang3.ArrayUtils.swap;

public class QuickSort {
    
    public static void sort(int[] arr) {
        if(arr == null) {
            return;
        }
        qsort(arr, 0, arr.length - 1);
    }

    private static void qsort(int[] arr, int start, int end) {
        if(start > end) {
            return;
        }
        int pivot = partition(arr, start, end);
        qsort(arr, start, pivot - 1);
        qsort(arr, pivot + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {
        if(start > end) {
            return -1;
        }
        int left = start, right = end;
        int p = start + new Random().nextInt(end - start);
        swap(arr, p, start);
        int pivot = arr[start];
        while(true) {
            while(left <= right && arr[right] >= pivot) {
                right--;
            }
            while(left <= right && arr[left] <= pivot) {
                left++;
            }
            if(left >= right) {
                break;
            }
            swap(arr, left, right);
        }
        swap(arr, right, start);
        return right;
    }

    private static int partition2(int[] arr, int start, int end) {
        if(start > end) {
            return -1;
        }
        int p = start + new Random().nextInt(end - start);
        swap(arr, p, end);
        int pivot = arr[end];
        int store = start;
        for (int i = start; i < end - 1; i++) {
            if(arr[i] <= pivot) {
                swap(arr, i, store);
                store++;
            }
        }
        swap(arr, store, end);
        return store;
    }

}
