package types.binarysearch;

public class BinarySearchIterative {

    public static int search(int[] arr, int key, int min, int max) {
        while(min <= max) {
            int mid = min + ((max - min) >> 1);
            if(arr[mid] < key) {
                min = mid + 1;
            }else if(arr[mid] > key) {
                max = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }

        System.out.println(search(arr, 5, 0, 9));
    }

}
