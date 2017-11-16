package types.divide;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testSearch() {
        assertEquals(0, BinarySearch.search(new int[] {1, 2, 3}, 1));
        assertEquals(1, BinarySearch.search(new int[] {1, 2, 3}, 2));
        assertEquals(2, BinarySearch.search(new int[] {1, 2, 3}, 3));
    }

}