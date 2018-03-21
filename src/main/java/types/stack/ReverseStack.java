package types.stack;

import java.util.Stack;

public class ReverseStack {

    public void reverse(Stack<Integer> stack) {
        if(stack == null) {
            return;
        }
        if(stack.isEmpty()) {
            return;
        }
        Integer top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);
    }

    private void insertAtBottom(Stack<Integer> stack, Integer top) {
        if(stack.isEmpty()) {
            stack.push(top);
            return;
        }
        Integer pop = stack.pop();
        insertAtBottom(stack, top);
        stack.push(pop);
    }

}
