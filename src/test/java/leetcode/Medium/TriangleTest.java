package leetcode.Medium;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void minimumTotal() throws Exception {

        assertEquals(11, Triangle.minimumTotal(
                Arrays.asList(
                        Arrays.asList(2),
                        Arrays.asList(3, 4),
                        Arrays.asList(6, 5 ,7),
                        Arrays.asList(4, 1, 8, 3)
                )
        ));

    }

}