package offer.sort;

public class CountingSort {

    public static <E extends Integer> void sort(E[] arr, int max) {
        if(arr == null || max < 1) {
            return;
        }
        int[] countArr = new int[max];
        Object[] temp = new Object[arr.length];
        for (int i = 0; i < max; i++) {
            countArr[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].compareTo(max - 1) > 0) {
                throw new IllegalArgumentException("counting value is not enough");
            }
            countArr[arr[i].intValue()] = countArr[arr[i]] + 1;
        }

        for (int i = 1; i < max; i++) {
            countArr[i] += countArr[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            temp[countArr[arr[i]] - 1] = arr[i];
            countArr[arr[i].intValue()] = countArr[arr[i]] - 1;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (E) temp[i];
        }
    }

}
