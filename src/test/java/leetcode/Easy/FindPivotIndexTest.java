package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindPivotIndexTest {
    @Test
    public void pivotIndex() throws Exception {

        assertEquals(3, FindPivotIndex.pivotIndex(
                new int[]{
                        1, 7, 3, 6, 5, 6
                }
        ));

        assertEquals(0, FindPivotIndex.pivotIndex(
                new int[]{
                        -1, -1, -1, 0, 1, 1
                }
        ));

    }

}