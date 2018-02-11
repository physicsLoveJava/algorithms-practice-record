package leetcode.ex;

import leetcode.Easy.MaximumSubarray;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumSubArrayDadTest {
    @Test
    public void find() throws Exception {

        assertEquals(0, MaximumSubArrayDad.find(
                new int[] {

                }
        ));

        assertEquals(6, MaximumSubArrayDad.find(
                new int[] {
                        -2,1,-3,4,-1,2,1,-5,4
                }
        ));

        assertEquals(-1, MaximumSubArrayDad.find(
                new int[] {
                        -1
                }
        ));

    }

}