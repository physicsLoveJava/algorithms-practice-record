package types.binarysearch;

public class BinarySearchRecursive {

    public static int search(int[] arr, int key, int min, int max) {
        if(min > max) {
            return -1;
        }
        int mid = min + ((max - min) >> 1); // bit operation low priority
        if(arr[mid] < key) {
            return search(arr, key, mid + 1, max);
        }else if(arr[mid] > key) {
            return search(arr, key, min, mid - 1);
        }else {
            return mid;
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

        System.out.println(search(arr, 5, 0, 9));
    }

}
