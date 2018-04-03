package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeatersTest {
    @Test
    public void findRadius() throws Exception {

        assertEquals(1, new Heaters().findRadius(
                new int[] {
                        1, 2, 3
                },
                new int[] {
                        2
                }
        ));

        assertEquals(1, new Heaters().findRadius(
                new int[] {
                        1, 2, 3, 4
                },
                new int[] {
                        1, 4
                }
        ));

        assertEquals(1, new Heaters().findRadius(
                new int[] {
                        1, 5
                },
                new int[] {
                        2
                }
        ));

    }

}