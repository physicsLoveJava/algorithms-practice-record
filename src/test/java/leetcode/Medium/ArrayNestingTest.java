package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayNestingTest {
    @Test
    public void arrayNesting() throws Exception {

        assertEquals(4, new ArrayNesting().arrayNesting(
                new int[]{
                        5, 4, 0, 3, 1, 6, 2
                }
        ));

        assertEquals(6, new ArrayNesting().arrayNesting(
                new int[]{
                        1, 2, 3, 4, 5, 0
                }
        ));

    }

}