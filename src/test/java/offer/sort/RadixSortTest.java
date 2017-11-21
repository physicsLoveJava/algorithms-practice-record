package offer.sort;

import org.junit.Test;
import util.PrintUtils;

import java.util.Comparator;

import static org.junit.Assert.*;

public class RadixSortTest {
    @Test
    public void sort() throws Exception {
        Integer[] arr = CommonSortUtility.generateRandomArray(20);
        PrintUtils.printArray(arr);
        RadixSort.sort(arr, 10);
        PrintUtils.printArray(arr);
    }

}