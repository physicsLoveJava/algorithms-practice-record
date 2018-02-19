package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoKeyKeyboardTest {
    @Test
    public void minSteps() throws Exception {

        assertEquals(0, TwoKeyKeyboard.minSteps(1));
        assertEquals(2, TwoKeyKeyboard.minSteps(2));
        assertEquals(3, TwoKeyKeyboard.minSteps(3));
        assertEquals(4, TwoKeyKeyboard.minSteps(4));
        assertEquals(5, TwoKeyKeyboard.minSteps(5));
        assertEquals(5, TwoKeyKeyboard.minSteps(6));
        assertEquals(7, TwoKeyKeyboard.minSteps(7));
        assertEquals(6, TwoKeyKeyboard.minSteps(8));
        assertEquals(12, TwoKeyKeyboard.minSteps(35));

    }

    @Test
    public void testMaxDivisor() {
        assertEquals(true, (10 % 5) == 0);
        assertEquals(false, (10 % 4) == 0);
    }

}