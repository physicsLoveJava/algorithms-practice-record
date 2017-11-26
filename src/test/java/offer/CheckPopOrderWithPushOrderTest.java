package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPopOrderWithPushOrderTest {
    @Test
    public void isPossible() throws Exception {

        int[] order = {1, 2, 3, 4, 5};
        int[] positive = {4, 5, 3, 2, 1};
        int[] negative = {4, 3, 5, 1, 2};

        assertEquals(true, CheckPopOrderWithPushOrder.isPossible(order, positive));
        assertEquals(false, CheckPopOrderWithPushOrder.isPossible(order, negative));

    }

    @Test
    public void isPossible2() throws Exception {

        int[] order = {1, 2, 3, 4, 5};
        int[] positive = {4, 5, 3};
        int[] negative = {4, 3, 5, 1};

        assertEquals(true, CheckPopOrderWithPushOrder.isPossible(order, positive));
        assertEquals(false, CheckPopOrderWithPushOrder.isPossible(order, negative));

    }

}