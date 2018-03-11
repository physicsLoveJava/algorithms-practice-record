package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArithmeticSlicesTest {
    @Test
    public void numberOfArithmeticSlices() throws Exception {

        assertEquals(0, new ArithmeticSlices().numberOfArithmeticSlices(
                new int[]{1, 1, 2, 5, 7}
        ));

        assertEquals(1, new ArithmeticSlices().numberOfArithmeticSlices(
                new int[]{1, 1, 1}
        ));

        assertEquals(3, new ArithmeticSlices().numberOfArithmeticSlices(
                new int[]{1, 1, 1, 1}
        ));

        assertEquals(1, new ArithmeticSlices().numberOfArithmeticSlices(
                new int[]{1, 1, 1, 2}
        ));

    }

    @Test
    public void testx() {
        assertEquals(2, new ArithmeticSlices().numberOfArithmeticSlices(
                new int[]{1, 2, 3, 8, 9, 10}
        ));
    }

}