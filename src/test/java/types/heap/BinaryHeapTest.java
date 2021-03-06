package types.heap;

import org.junit.Test;

public class BinaryHeapTest {

    @Test
    public void testBasicOperations() {
        BinaryHeap<Integer> heap = new BinaryHeap<>(10);
        for (int i = 0; i < 10; i++) {
            heap.insert(10 - i);
        }

        while(!heap.isEmpty()) {
            System.out.println(heap.pop());
        }
    }

    @Test
    public void testHeapify() {
        Integer[] arr = new Integer[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 10 - i;
        }
        BinaryHeap<Integer> heap = new BinaryHeap<>(arr);
        while(!heap.isEmpty()) {
            System.out.println(heap.pop());
        }
    }

}