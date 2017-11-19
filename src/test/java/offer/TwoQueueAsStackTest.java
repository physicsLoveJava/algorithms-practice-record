package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoQueueAsStackTest {
    @Test
    public void push() throws Exception {
        TwoQueueAsStack<Integer> stack = new TwoQueueAsStack<Integer>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        for (int i = 9; i >= 0; i--) {
            assertEquals(i, stack.pop().intValue());
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void pop() throws Exception {
        new TwoQueueAsStack<Integer>().pop();
    }

}