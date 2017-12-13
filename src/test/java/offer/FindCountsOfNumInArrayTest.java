package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindCountsOfNumInArrayTest {
    @Test
    public void find() throws Exception {

        assertEquals(-1, FindCountsOfNumInArray.find(null, 5));
        assertEquals(0, FindCountsOfNumInArray.find(new int[]{1, 2, 3, 3, 3, 3, 4}, 5));
        assertEquals(4, FindCountsOfNumInArray.find(new int[]{1, 2, 3, 3, 3, 3, 4}, 3));
        assertEquals(5, FindCountsOfNumInArray.find(new int[]{1, 2, 3, 3, 3, 3, 3}, 3));
        assertEquals(7, FindCountsOfNumInArray.find(new int[]{3, 3, 3, 3, 3, 3, 3}, 3));

    }

}