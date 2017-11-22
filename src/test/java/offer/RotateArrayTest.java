package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateArrayTest {
    @Test
    public void min() throws Exception {

        assertEquals(1, RotateArray.min(new int[]{3, 4, 5, 1, 2}));
        assertEquals(1, RotateArray.min(new int[]{3, 4, 5, 6, 1, 2}));
        assertEquals(1, RotateArray.min(new int[]{3, 4, 5, 6, 7, 1, 2}));
    }

}