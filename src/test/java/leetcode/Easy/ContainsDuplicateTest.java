package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDuplicateTest {
    @Test
    public void containsDuplicate() throws Exception {

        assertFalse(new ContainsDuplicate().containsDuplicate(new int[]{
                1, 2, 3, 4, 5
        }));

        assertTrue(new ContainsDuplicate().containsDuplicate(new int[]{
                1, 2, 3, 1, 5
        }));

    }

}