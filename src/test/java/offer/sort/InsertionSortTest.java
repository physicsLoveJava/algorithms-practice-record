package offer.sort;

import org.junit.Test;
import util.PrintUtils;

import java.util.Comparator;

import static org.junit.Assert.*;

public class InsertionSortTest extends AbstractSortTest {

    @Test
    public void sort() throws Exception {
        Integer[] arr = generateRandomArray();
        PrintUtils.printArray(arr);
        InsertionSort.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        PrintUtils.printArray(arr);
    }

}