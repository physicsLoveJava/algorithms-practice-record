package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountOneInBinaryStringTest {

    @Test
    public void count() throws Exception {

        assertEquals(2, CountOneInBinaryString.count(6));
        assertEquals(3, CountOneInBinaryString.count(7));
        assertEquals(1, CountOneInBinaryString.count(8));

    }

}