package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class StaircaseWalk2Test {
    @Test
    public void walk() throws Exception {

        assertEquals(1, StaircaseWalk2.walk(1, 1));
        assertEquals(1, StaircaseWalk2.walk(2, 1));
        assertEquals(1, StaircaseWalk2.walk(1, 2));
        assertEquals(2, StaircaseWalk2.walk(2, 2));
        assertEquals(3432, StaircaseWalk2.walk(8, 8));

    }

}