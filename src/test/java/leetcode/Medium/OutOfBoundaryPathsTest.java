package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OutOfBoundaryPathsTest {
    @Test
    public void findPaths() throws Exception {

        assertEquals(6, new OutOfBoundaryPaths().findPaths(
                2, 2, 2, 0, 0
        ));

        assertEquals(12, new OutOfBoundaryPaths().findPaths(
                1, 3, 3, 0, 1
        ));

    }

}