package types.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EditDistanceRecursionTest {
    @Test
    public void editDistance() throws Exception {
        assertEquals(0, new EditDistanceRecursion().editDistance("abc", "abc"));
        assertEquals(1, new EditDistanceRecursion().editDistance("bc", "abc"));
        assertEquals(1, new EditDistanceRecursion().editDistance("bbc", "abc"));
        assertEquals(4, new EditDistanceRecursion().editDistance("abcde", "edcba"));
    }

}