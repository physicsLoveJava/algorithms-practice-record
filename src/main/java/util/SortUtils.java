package util;

public class SortUtils {

    public static <E extends Comparable> void swap(E[] arr, int source, int target) {
        E tmp = arr[source];
        arr[source] = arr[target];
        arr[target] = tmp;
    }

}
