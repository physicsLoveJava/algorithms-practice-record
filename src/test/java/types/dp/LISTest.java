package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LISTest {
    @Test
    public void find() throws Exception {

        assertEquals(4, LIS.find(
                new int[] {
                        1, 2, 3, 4
                }
        ));

        assertEquals(1, LIS.find(
                new int[] {
                        5, 4, 3, 2, 1
                }
        ));

        assertEquals(3, LIS.find(
                new int[] {
                        3, -1, 4, -2, 5, -1
                }
        ));

        assertEquals(4, LIS.find(
                new int[] {
                        1, 3, 5, 4, 7
                }
        ));

        assertEquals(1, LIS.find(
                new int[] {
                        2, 2, 2, 2, 2
                }
        ));

    }

}