package types.divide;

public class BinarySearch {

    public static int search(int[] arr, int value) {
        return search(arr, value, 0, arr.length);
    }

    private static int search(int[] arr, int value, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        int cmp = arr[mid] - value;
        if(cmp > 0) {
            return search(arr, value, start, mid);
        }else if(cmp <0) {
            return search(arr, value, mid, end);
        }else {
            return mid;
        }
    }

}
