package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniquePathsTest {
    @Test
    public void uniquePaths() throws Exception {

        assertEquals(1, new UniquePaths().uniquePaths(1, 1));
        assertEquals(1, new UniquePaths().uniquePaths(1, 2));
        assertEquals(2, new UniquePaths().uniquePaths(2, 2));
        assertEquals(3, new UniquePaths().uniquePaths(2, 3));

    }

}