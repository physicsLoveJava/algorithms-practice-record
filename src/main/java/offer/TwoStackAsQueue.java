package offer;

import java.util.Stack;

public class TwoStackAsQueue<E> {

    Stack<E> enStack;
    Stack<E> deStack;

    public TwoStackAsQueue() {
        enStack = new Stack<E>();
        deStack = new Stack<E>();
    }

    public void enqueue(E item) {
        enStack.push(item);
    }

    public E dequeue() {
        if(deStack.isEmpty()) {
            if(enStack.isEmpty()) {
                throw new IndexOutOfBoundsException();
            }
            while(!enStack.isEmpty()) {
                deStack.push(enStack.pop());
            }
        }
        return deStack.pop();
    }


}
