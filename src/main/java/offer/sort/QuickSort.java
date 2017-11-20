package offer.sort;

import util.SortUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class QuickSort {

    static Random random = new Random();

    public static <E extends Comparable> void sort(E[] arr, Comparator<E> comparator) {
        if(arr == null) {
            return;
        }
        sort(arr, 0, arr.length - 1, comparator);
    }

    private static <E extends Comparable> void sort(E[] arr, int start, int end, Comparator<E> comparator) {
        if(start >= end) {
            return;
        }
        int point = partition(arr, start, end, comparator);
        sort(arr, start, point - 1, comparator);
        sort(arr, point + 1, end, comparator);
    }

    private static <E extends Comparable> int partition(E[] arr, int start, int end, Comparator<E> comparator) {
        int i = start;
        int j = end;
        int p = random.nextInt(end - start) + start;
        E pivot = arr[p];
        SortUtils.swap(arr, start, p);
        while(true) {
            while(comparator.compare(arr[j], pivot) >= 0 && i < j) {
                j--;
            }
            while(comparator.compare(arr[i], pivot) <= 0 && i < j) {
                i++;
            }
            if(i >= j) {
                break;
            }else {
                SortUtils.swap(arr, i, j);
            }
        }
        SortUtils.swap(arr, start, j);
        return j;
    }

}
