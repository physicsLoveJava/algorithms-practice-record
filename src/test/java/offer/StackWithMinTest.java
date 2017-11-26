package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackWithMinTest {

    @Test
    public void test() {

        StackWithMin stack = new StackWithMin();

        stack.push(3);
        assertEquals(3, stack.min().intValue());

        stack.push(5);
        assertEquals(3, stack.min().intValue());

        stack.push(1);
        assertEquals(1, stack.min().intValue());

        stack.pop();
        assertEquals(3, stack.min().intValue());

        stack.pop();
        assertEquals(3, stack.min().intValue());

        stack.pop();



    }


}