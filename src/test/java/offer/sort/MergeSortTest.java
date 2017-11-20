package offer.sort;

import org.junit.Test;
import util.PrintUtils;

import java.util.Comparator;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort() throws Exception {
        Integer[] arr = CommonSortUtility.generateRandomArray();
        PrintUtils.printArray(arr);
        MergeSort.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        PrintUtils.printArray(arr);
    }

}