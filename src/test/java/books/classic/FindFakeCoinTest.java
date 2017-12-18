package books.classic;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindFakeCoinTest {
    @Test
    public void find() throws Exception {

        assertEquals(7, FindFakeCoin.find(new int[] {1, 1, 1, 1, 1, 1, 1, 0}));
        assertEquals(6, FindFakeCoin.find(new int[] {1, 1, 1, 1, 1, 1, 0, 1}));
        assertEquals(5, FindFakeCoin.find(new int[] {1, 1, 1, 1, 1, 0, 1, 1}));
        assertEquals(4, FindFakeCoin.find(new int[] {1, 1, 1, 1, 0, 1, 1, 1}));
        assertEquals(3, FindFakeCoin.find(new int[] {1, 1, 1, 0, 1, 1, 1, 1}));
        assertEquals(2, FindFakeCoin.find(new int[] {1, 1, 0, 1, 1, 1, 1, 1}));
        assertEquals(1, FindFakeCoin.find(new int[] {1, 0, 1, 1, 1, 1, 1, 1}));
        assertEquals(0, FindFakeCoin.find(new int[] {0, 1, 1, 1, 1, 1, 1, 1}));

    }

    @Test
    public void findWithWeight() {
        assertEquals(0, FindFakeCoin.findWithWieght(new int[] {0, 1, 1, 1, 1, 1, 1, 1}));
        assertEquals(0, FindFakeCoin.findWithWieght(new int[] {2, 1, 1, 1, 1, 1, 1, 1}));
    }

}