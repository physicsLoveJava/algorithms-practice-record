package offer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

import static util.SortUtils.partition;

public class FindTopK {

    public static String findWithHeap(int[] array, int k) {
        if(array == null || k < 1) {
            return null;
        }
        if(k > array.length - 1) {
            return Arrays.toString(array);
        }
        PriorityQueue<Integer> queue = new PriorityQueue<>(k);

        for (int i = 0; i < array.length; i++) {
            if(queue.size() < k) {
                queue.add(array[i]);
            }else {
                if (queue.peek() < array[i]) {
                    queue.poll();
                    queue.add(array[i]);
                }
            }
        }

        return Arrays.toString(queue.toArray());
    }

    public static String find(int[] array, int k) {
        if(array == null || k < 1) {
            return null;
        }
        if(k > array.length - 1) {
            return Arrays.toString(array);
        }
        int start = 0;
        int end = array.length - 1;
        int idx = partition(array, start, end, -1);
        while(idx != k - 1) {
            if(idx < k - 1) {
                start = idx + 1;
                idx = partition(array, start, end, -1);
            }else {
                end = idx - 1;
                idx = partition(array, start, end, -1);
            }
        }
        return (Arrays.toString(Arrays.copyOfRange(array, 0, idx + 1)));
    }


}
