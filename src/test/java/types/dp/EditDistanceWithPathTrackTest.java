package types.dp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EditDistanceWithPathTrackTest {
    @Test
    public void editDistance() throws Exception {
        assertEquals(0, new EditDistanceWithPathTrack().editDistance("abc", "abc"));
        assertEquals(1, new EditDistanceWithPathTrack().editDistance("bc", "abc"));
        assertEquals(1, new EditDistanceWithPathTrack().editDistance("bbc", "abc"));
        assertEquals(4, new EditDistanceWithPathTrack().editDistance("abcde", "edcba"));
    }

}