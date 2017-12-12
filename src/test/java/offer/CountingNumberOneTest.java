package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountingNumberOneTest {
    @Test
    public void count() throws Exception {

        assertEquals(2, CountingNumberOne.count(10));
        assertEquals(21, CountingNumberOne.count(100));

    }

}