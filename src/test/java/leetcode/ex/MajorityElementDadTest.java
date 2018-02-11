package leetcode.ex;

import leetcode.Easy.MajorityElement;
import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementDadTest {
    @Test
    public void find() throws Exception {

        assertEquals(5, MajorityElementDad.find(
                new int[] {
                        1, 2, 3, 5, 5, 5
                }
        ));

        assertEquals(5, MajorityElementDad.find(
                new int[] {
                        1, 2, 3, 5, 5, 5, 4
                }
        ));

    }

}