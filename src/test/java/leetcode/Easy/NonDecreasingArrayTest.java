package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class NonDecreasingArrayTest {
    @Test
    public void checkPossibility() throws Exception {

        assertTrue(new NonDecreasingArray().checkPossibility(
                new int[]{
                        4, 2, 3
                }
        ));

        assertFalse(new NonDecreasingArray().checkPossibility(
                new int[]{
                        4, 2, 1
                }
        ));

        assertFalse(new NonDecreasingArray().checkPossibility(
                new int[]{
                        3, 4, 1, 3
                }
        ));

    }

}