package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class RangeSumQueryImmutableTest {

    @Test
    public void testX() {
        RangeSumQueryImmutable.NumArray array = new RangeSumQueryImmutable.NumArray(new int[]{
                1, 2, 3, 4
        });

        assertEquals(5, array.sumRange(1, 2));
        assertEquals(7, array.sumRange(2, 3));
        assertEquals(9, array.sumRange(1, 3));
        assertEquals(2, array.sumRange(1, 1));
    }

}