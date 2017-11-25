package offer;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ReorderingArrayTest {
    @Test
    public void makeOddBeforeEven() throws Exception {
        assertEquals(null, ReorderingArray.makeOddBeforeEven(null));
        assertArrayEquals(new int[] {1, 1, 1}, ReorderingArray.makeOddBeforeEven(new int[]{1, 1, 1}));
        assertArrayEquals(new int[] {1, 1, 2}, ReorderingArray.makeOddBeforeEven(new int[]{1, 2, 1}));
        assertArrayEquals(new int[] {1, 5, 1, 3, 2, 6}, ReorderingArray.makeOddBeforeEven(new int[]{1, 2, 1, 3, 5, 6}));
    }

    @Test
    public void makePositiveBeforeNegative() throws Exception {
        assertArrayEquals(new int[] {1, 1, -1, -1}, ReorderingArray.makePositiveBeforeNegative(new int[] {1, -1, 1, -1}));
        assertArrayEquals(new int[] {1, 1, 1, -1, -1, -1, -1}, ReorderingArray.makePositiveBeforeNegative(new int[] {1, 1, -1, -1, -1, -1, 1}));
    }

    @Test
    public void makeXBeforeY() throws Exception {
        ConditionX condition = new ConditionX() {
            @Override
            public boolean makeX(int value) {
                return value > 0;
            }
        };
        assertArrayEquals(new int[] {1, 1, -1, -1}, ReorderingArray.makeXBeforeY(new int[] {1, -1, 1, -1}, condition));
        assertArrayEquals(new int[] {1, 1, 1, -1, -1, -1, -1}, ReorderingArray.makeXBeforeY(new int[] {1, 1, -1, -1, -1, -1, 1}, condition));
    }
}