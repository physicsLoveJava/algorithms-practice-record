package types.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EditDistanceTest {
    @Test
    public void editDistance() throws Exception {
        assertEquals(0, new EditDistance().editDistance("abc", "abc"));
        assertEquals(1, new EditDistance().editDistance("bc", "abc"));
        assertEquals(1, new EditDistance().editDistance("bbc", "abc"));
        assertEquals(4, new EditDistance().editDistance("abcde", "edcba"));
    }

}