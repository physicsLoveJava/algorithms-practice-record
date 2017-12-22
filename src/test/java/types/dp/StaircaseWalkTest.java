package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaircaseWalkTest {
    @Test
    public void walk() throws Exception {

        assertEquals(1, StaircaseWalk.walk(1, 1));
        assertEquals(1, StaircaseWalk.walk(2, 1));
        assertEquals(1, StaircaseWalk.walk(1, 2));
        assertEquals(2, StaircaseWalk.walk(2, 2));
        assertEquals(3432, StaircaseWalk2.walk(8, 8));

    }

}