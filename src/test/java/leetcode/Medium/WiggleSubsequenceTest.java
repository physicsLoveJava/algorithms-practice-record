package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WiggleSubsequenceTest {
    @Test
    public void wiggleMaxLength() throws Exception {

        assertEquals(1, new WiggleSubsequence().wiggleMaxLength(
                new int[]{
                        0, 0
                }
        ));

        assertEquals(6, new WiggleSubsequence().wiggleMaxLength(
                new int[]{
                        1, 7, 4, 9, 2, 5
                }
        ));

        assertEquals(7, new WiggleSubsequence().wiggleMaxLength(
                new int[]{
                        1, 17, 5, 10, 13, 15, 10, 5, 16, 8
                }
        ));

        assertEquals(2, new WiggleSubsequence().wiggleMaxLength(
                new int[]{
                        1, 2, 3, 4, 5, 6, 7, 8, 9
                }
        ));

        assertEquals(8, new WiggleSubsequence().wiggleMaxLength(
                new int[]{
                        3, 4, 2, -5, -4, -5, -4, -5, -4
                }
        ));

    }

}