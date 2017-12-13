package offer;

public class FindNumsWithSpecificValue {

    public static int[] find(int[] array, int val) {
        if(array == null) {
            return null;
        }
        int start = 0;
        int end = array.length - 1;
        while(start < end) {
            int sum = array[start] + array[end];
            if(sum > val) {
                end -= 1;
            }else if(sum < val) {
                start += 1;
            }else {
                return new int[]{array[start], array[end]};
            }
        }
        return null;
    }

}
