package types.heap;

import java.lang.reflect.Array;

import static util.SortUtils.swap;

public class BinaryHeap<T extends Comparable> {

    private T[] elements;

    private int size;

    private int maxSize;

    public BinaryHeap(int size) {
        this.maxSize = size + 1;
        this.elements = (T[]) Array.newInstance(Comparable.class, maxSize);
    }

    public BinaryHeap(T[] arr) {
        this.maxSize = arr.length + 1;
        this.elements = (T[]) Array.newInstance(Comparable.class, maxSize);;
        this.size = maxSize - 1;
        System.arraycopy(arr, 0, elements, 1, arr.length);
        heapify();
    }

    private void heapify() {
        for (int i = maxSize / 2; i >= 1; i--) {
            siftDown(i, elements[i]);
        }
    }

    public void insert(T item) {
        if(size + 1 > maxSize) {
            throw new IndexOutOfBoundsException();
        }
        elements[++size] = item;
        siftUp(size, item);
    }

    private void siftUp(int idx, T item) {
        int tmp = idx >> 1;
        while(tmp >= 1 && elements[tmp].compareTo(item) > 0) {
            swap(elements, tmp, idx);
            idx = tmp;
            tmp >>= 1;
        }
    }

    public T pop() {
        if(size < 1) {
            throw new IndexOutOfBoundsException();
        }
        T rs = elements[1];
        elements[1] = elements[size--];
        siftDown(1, elements[1]);
        return rs;
    }

    private void siftDown(int idx, T element) {
        int maxIdx = idx;
        int left = 2 * idx;
        if(left <= size && elements[left].compareTo(elements[idx]) < 0) {
            swap(elements, idx, left);
            maxIdx = left;
        }
        int right = 2 * idx + 1;
        if(right <= size && elements[right].compareTo(elements[idx]) < 0) {
            swap(elements, idx, right);
            maxIdx = right;
        }
        if(maxIdx != idx) {
            siftDown(maxIdx, element);
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
