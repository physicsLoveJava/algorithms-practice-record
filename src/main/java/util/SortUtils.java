package util;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class SortUtils {

    private static Random random = new Random();

    public static <E extends Comparable> void swap(E[] arr, int source, int target) {
        E tmp = arr[source];
        arr[source] = arr[target];
        arr[target] = tmp;
    }

    public static int partition(int[] array, int start, int end, Comparator<Integer> comparator) {
        if(start > end) {
            return -1;
        }
        if(start == end) {
            return start;
        }
        int left = start;
        int right = end;
        int p = random.nextInt(end - start) + start;
        int pivot = array[p];
        ArrayUtils.swap(array, p, start);
        while(left < right) {
            while(comparator.compare(array[right], pivot) >= 0 && left < right) {
                right--;
            }
            while(comparator.compare(array[left], pivot) <= 0 && left < right) {
                left++;
            }
            if(left < right) {
                ArrayUtils.swap(array, left, right);
            }
        }
        ArrayUtils.swap(array, right, start);
        return right;
    }

    public static int partition(int[] array, int start, int end, int order) {
        if(order > 0) {
            return partition(array, start, end, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });
        }
        return partition(array, start, end, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1 * o1.compareTo(o2);
            }
        });
    }

    public static int partition(int[] array, int start, int end) {
        return partition(array, start, end, 1);
    }

}
