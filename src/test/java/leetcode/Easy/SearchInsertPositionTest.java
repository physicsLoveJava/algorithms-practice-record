package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertPositionTest {
    @Test
    public void searchInsert() throws Exception {

        assertEquals(2, new SearchInsertPosition().searchInsert(
                new int[]{
                        1, 3, 5, 6
                },
                5
        ));

    }

}