package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class OnesAndZeroesTest {
    @Test
    public void findMaxForm() throws Exception {

        assertEquals(4, OnesAndZeroes.findMaxForm(
                new String[] {"10", "0001", "111001", "1", "0"},
                5, 3
        ));

        assertEquals(2, OnesAndZeroes.findMaxForm(
                new String[] {"10", "0", "1"},
                1, 1
        ));

    }

}