package leetcode.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class CherryPickupTest {

    @Test
    public void checkPickUp_bound() {

        assertEquals(1, new CherryPickup().cherryPickup(new int[][] {
                {0, 1, 0},
        }));

        assertEquals(1, new CherryPickup().cherryPickup(new int[][] {
                {0},
                {1},
                {0}
        }));

        assertEquals(0, new CherryPickup().cherryPickup(new int[][] {
                {0},
                {0},
                {0}
        }));

        assertEquals(0, new CherryPickup().cherryPickup(new int[][] {
                {0},
                {-1},
                {0}
        }));
    }

    @Test
    public void cherryPickup() throws Exception {

        assertEquals(5, new CherryPickup().cherryPickup(new int[][] {
                {0, 1, -1},
                {1, 0, 0},
                {1, 1, 1}
        }));

    }

    @Test
    public void cherryPickup2() {
        assertEquals(7, new CherryPickup().cherryPickup(new int[][] {
                {0, 1, -1, 1},
                {1, 0, 1, 1},
                {1, 1, 1, 0}
        }));
    }

    @Test
    public void cherryPickup3() {
        assertEquals(8, new CherryPickup().cherryPickup(new int[][] {
                {0, 0, 0, 0},
                {1, 1, -1, 1},
                {1, 0, 1, 1},
                {1, 1, 1, 0}
        }));
    }

}