package leetcode.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementSp1Test {
    @Test
    public void find() throws Exception {

        assertEquals(5, MajorityElementSp1.find(
                new int[] {
                        1, 2, 3, 5, 5, 5
                }
        ));

        assertEquals(5, MajorityElementSp1.find(
                new int[] {
                        1, 2, 5, 5, 5, 5, 4
                }
        ));

    }

}