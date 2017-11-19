package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStackAsQueueTest {

    @Test
    public void enqueue() throws Exception {

        TwoStackAsQueue<Integer> queue = new TwoStackAsQueue<Integer>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }

        for (int i = 0; i < 10; i++) {
            assertEquals(i, queue.dequeue().intValue());
        }

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void dequeue() throws Exception{
        new TwoStackAsQueue<Integer>().dequeue();
    }

}