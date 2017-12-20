package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class StairsClimbingTest {
    @Test
    public void climb() throws Exception {
        assertEquals(1, StairsClimbing.climb(1));
        assertEquals(1, StairsClimbing.climb(2));
        assertEquals(2, StairsClimbing.climb(3));
        assertEquals(3, StairsClimbing.climb(4));
        assertEquals(5, StairsClimbing.climb(5));
    }

    @Test
    public void climbUp() throws Exception {
        assertEquals(1, StairsClimbing.climbUp(1));
        assertEquals(1, StairsClimbing.climbUp(2));
        assertEquals(2, StairsClimbing.climbUp(3));
        assertEquals(3, StairsClimbing.climbUp(4));
        assertEquals(5, StairsClimbing.climbUp(5));
    }

}