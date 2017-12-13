package offer;

public class FindCountsOfNumInArray {

    public static int find(int[] array, int key) {
        if(array == null) {
            return -1;
        }
        int left = findLeftBound(array, key, 0, array.length - 1);
        int right = findRightBound(array, key, 0, array.length - 1);
        if(left > -1 && right > -1) {
            return right - left + 1;
        }
        return 0;
    }

    private static int findLeftBound(int[] array, int key, int start, int end) {
        if(start > end) {
            return  -1;
        }
        int mid = (start + end) / 2;
        int midVal = array[mid];
        if(midVal == key) {
            if((mid > 0 && array[mid - 1] != key)
                    || mid == 0) {
                return mid;
            }else {
                end = mid - 1;
            }
        }else if(midVal > key) {
            end = mid - 1;
        }else {
            start = mid + 1;
        }
        return findLeftBound(array, key, start, end);
    }

    private static int findRightBound(int[] array, int key, int start, int end) {
        if(start > end) {
            return  -1;
        }
        int mid = (start + end) / 2;
        int midVal = array[mid];
        if(midVal == key) {
            if((mid < array.length - 1 && array[mid + 1] != key)
                    || mid == array.length - 1) {
                return mid;
            }else {
                start = mid + 1;
            }
        }else if(midVal > key) {
            end = mid - 1;
        }else {
            start = mid + 1;
        }
        return findRightBound(array, key, start, end);
    }

}
