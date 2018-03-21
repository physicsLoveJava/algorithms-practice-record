package types.stack;

import org.junit.Test;

import java.util.Stack;

public class ReverseStackTest {
    @Test
    public void reverse() throws Exception {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        new ReverseStack().reverse(stack);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}