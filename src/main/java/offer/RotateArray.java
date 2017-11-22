package offer;

public class RotateArray {

    public static int min(int[] array) {
        if(array == null) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        while(left != right) {
            int mid = (left + right) / 2;
            if(right - left == 1) {
                return Math.min(array[right], array[left]);
            }
            if(array[mid] > array[left]) {
                left = mid;
            }
            if(array[mid] < array[right]) {
                right = mid;
            }
        }
        return array[left];
    }

}
