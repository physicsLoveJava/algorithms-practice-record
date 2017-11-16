package offer;

import org.junit.Test;
import util.adt.Pair;

import static org.junit.Assert.*;

public class MatrixFindTest {

    @Test
    public void found() throws Exception {
        int[][] m = new int[][] {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 9, 6},
                {3, 4, 5, 10, 12},
                {4, 5, 6, 11, 15},
        };
        Pair<Integer, Integer> pair = MatrixFind.find(m, 4, 5, 10);
        assertNotNull(pair);
        assertEquals(2, (int)pair.getKey());
        assertEquals(3, (int)pair.getValue());
    }

    @Test
    public void not_found() {
        int[][] m = new int[][] {
                {1, 2, 3, 4, 5},
                {2, 3, 4, 5, 6},
                {3, 4, 5, 6, 7},
                {4, 5, 6, 7, 8},
        };
        Pair<Integer, Integer> pair = MatrixFind.find(m, 4, 5, 10);
        assertNull(pair);
    }

}