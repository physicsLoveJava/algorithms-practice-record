package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestUnsortedContinuousSubarrayTest {
    @Test
    public void findUnsortedSubarray() throws Exception {

        assertEquals(5, new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(
                new int[]{
                        2, 6, 4, 8, 10, 9, 15
                }
        ));

        assertEquals(0, new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(
                new int[]{
                        2
                }
        ));

        assertEquals(0, new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(
                new int[]{
                        1, 2, 3, 4, 5
                }
        ));

        assertEquals(2, new ShortestUnsortedContinuousSubarray().findUnsortedSubarray(
                new int[]{
                        2, 1
                }
        ));

    }

}