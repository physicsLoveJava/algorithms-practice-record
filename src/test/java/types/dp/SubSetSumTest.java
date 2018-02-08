package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubSetSumTest {
    @Test
    public void find() throws Exception {

        assertTrue(SubSetSum.find(
                new int[]{
                        1, 2, 3, 4, 1, 2, 3, 4
                },
                1
        ));

        assertTrue(SubSetSum.find(
                new int[]{
                        1, 2, 3, 4, 1, 2, 3, 4
                },
                7
        ));

        assertFalse(SubSetSum.find(
                new int[]{
                        1, 2, 3, 4, 1, 2, 3, 4
                },
                25
        ));

    }

}