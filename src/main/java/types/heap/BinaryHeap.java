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

    public void insert(T item) {
        if(size + 1 > maxSize) {
            throw new IndexOutOfBoundsException();
        }
        elements[++size] = item;
        siftUp(size, item);
    }

    private void siftUp(int idx, T item) {
        int tmp = idx >> 1;
        while(tmp >= 1) {
            if(elements[tmp].compareTo(item) > 0) {
                swap(elements, tmp, idx);
                idx = tmp;
                tmp >>= 1;
            }else {
                break;
            }
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
