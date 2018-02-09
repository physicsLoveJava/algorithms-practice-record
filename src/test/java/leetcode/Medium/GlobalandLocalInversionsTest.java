package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GlobalandLocalInversionsTest {
    @Test
    public void isIdealPermutation() throws Exception {

        assertTrue(GlobalandLocalInversions.isIdealPermutation(
                new int[] {1, 0, 2}
        ));

        assertFalse(GlobalandLocalInversions.isIdealPermutation(
                new int[] {2, 0, 1}
        ));
    }

}