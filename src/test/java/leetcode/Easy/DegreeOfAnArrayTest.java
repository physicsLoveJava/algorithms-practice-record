package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class DegreeOfAnArrayTest {
    @Test
    public void findShortestSubArray() throws Exception {

        assertEquals(6, DegreeOfAnArray.findShortestSubArray(
                new int[]{
                        1, 2, 2, 3, 1, 4, 2
                }
        ));

        assertEquals(2, DegreeOfAnArray.findShortestSubArray(
                new int[]{
                        1, 2, 2, 3, 1
                }
        ));

        assertEquals(2, DegreeOfAnArray.findShortestSubArray(
                new int[]{
                        1, 3, 2, 2, 3, 1
                }
        ));

    }

}