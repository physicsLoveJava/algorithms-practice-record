package offer.sort;

import org.junit.Test;
import util.PrintUtils;

import java.util.Comparator;

public class QuickSortTest {

    @Test
    public void sort() throws Exception {
        Integer[] array = CommonSortUtility.generateRandomArray();
        PrintUtils.printArray(array);
        QuickSort.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        PrintUtils.printArray(array);
    }

}