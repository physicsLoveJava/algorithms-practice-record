package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxLinearArraySumsTest {
    @Test
    public void find() throws Exception {

        assertEquals(18, FindMaxLinearArraySums.find(new int[] {
                1, -2, 3,
                10, -4, 7,
                2, -5
        }));

        assertEquals(19, FindMaxLinearArraySums.find(new int[] {
                1, -2, 3,
                10, -4, 7,
                2, -5, 6
        }));

    }

    @Test
    public void findWithLoop() throws Exception {

        assertEquals(18, FindMaxLinearArraySums.findWithLoop(new int[] {
                1, -2, 3,
                10, -4, 7,
                2, -5
        }));

        assertEquals(19, FindMaxLinearArraySums.findWithLoop(new int[] {
                1, -2, 3,
                10, -4, 7,
                2, -5, 6
        }));

    }

}