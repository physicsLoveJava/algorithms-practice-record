package leetcode.contest.c6;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PerfectNumberTest {
    @Test
    public void perfectNumber() throws Exception {

        assertTrue(new PerfectNumber().perfectNumber(1));
        assertFalse(new PerfectNumber().perfectNumber(2));
        assertFalse(new PerfectNumber().perfectNumber(12));

        for (int i = 1; i < 100; i++) {
            boolean x = new PerfectNumber().perfectNumber(i);
            if(x) {
                System.out.println(x + ":" + i);
            }
        }
    }

}