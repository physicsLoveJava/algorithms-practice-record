package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNumsWithSpecificValueTest {
    @Test
    public void find() throws Exception {

        assertArrayEquals(new int[]{1, 6}, FindNumsWithSpecificValue.find(
                new int[]{1, 2, 3, 4, 6, 7}, 7));

    }

}