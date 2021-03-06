package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementTest {
    @Test
    public void majorityElement() throws Exception {

        assertEquals(5, MajorityElement.majorityElement(
                new int[] {
                        1, 2, 3, 5, 5, 5
                }
        ));

        assertEquals(5, MajorityElement.majorityElement(
                new int[] {
                        1, 2, 3, 5, 5, 5, 4
                }
        ));

    }

}