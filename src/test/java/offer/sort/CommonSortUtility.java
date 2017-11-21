package offer.sort;

import java.util.Random;

public class CommonSortUtility {

    static Random random = new Random();

    public static Integer[] generateRandomArray(int size) {
        return generateRandomArray(size, size);
    }

    public static Integer[] generateRandomArray() {
        return generateRandomArray(10, 10);
    }

    static private Integer[] generateRandomArray(int size, int range) {
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(range);
        }
        return arr;
    }

}
