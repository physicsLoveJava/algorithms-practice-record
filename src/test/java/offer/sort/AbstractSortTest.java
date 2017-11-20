package offer.sort;

import java.util.Random;

public class AbstractSortTest {

    Random random = new Random();

    protected Integer[] generateRandomArray() {
        return generateRandomArray(10, 10);
    }

    protected Integer[] generateRandomArray(int size, int range) {
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(range);
        }
        return arr;
    }

}
