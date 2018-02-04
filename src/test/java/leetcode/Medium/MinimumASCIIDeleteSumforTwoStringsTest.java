package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumASCIIDeleteSumforTwoStringsTest {
    @Test
    public void minimumDeleteSum() throws Exception {

        assertEquals(231, MinimumASCIIDeleteSumforTwoStrings.minimumDeleteSum("sea", "eat"));
        assertEquals(403, MinimumASCIIDeleteSumforTwoStrings.minimumDeleteSum("delete", "leet"));

    }

}