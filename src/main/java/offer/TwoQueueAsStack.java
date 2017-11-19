package offer;

import java.util.ArrayDeque;
import java.util.Queue;

public class TwoQueueAsStack<E> {

    Queue<E> mainQueue;
    Queue<E> assistQueue;

    public TwoQueueAsStack() {
        mainQueue = new ArrayDeque<E>();
        assistQueue = new ArrayDeque<E>();
    }

    public void push(E item) {
        mainQueue.add(item);
    }

    public E pop() {
        if(mainQueue.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        while(mainQueue.size() > 1) {
            assistQueue.add(mainQueue.poll());
        }
        E result = mainQueue.poll();
        while(!assistQueue.isEmpty()) {
            mainQueue.add(assistQueue.poll());
        }
        return result;
    }

}
