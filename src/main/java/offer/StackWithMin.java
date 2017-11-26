package offer;

import java.util.Stack;

public class StackWithMin {

    Stack<Integer> valueStack;
    Stack<Integer> minStack;

    public StackWithMin() {
        valueStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(Integer val) {
        valueStack.push(val);
        if(minStack.isEmpty()) {
            minStack.push(val);
        }else {
            if (minStack.peek() > val) {
                minStack.push(val);
            }else {
                minStack.push(minStack.peek());
            }
        }
    }

    public Integer pop() {
        minStack.pop();
        return valueStack.pop();
    }

    public Integer min() {
        return minStack.peek();
    }
}
