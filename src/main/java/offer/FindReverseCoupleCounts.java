package offer;

public class FindReverseCoupleCounts {

    public static int find(int[] array) {
        if(array == null) {
            return 0;
        }
        int cnt = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

}
