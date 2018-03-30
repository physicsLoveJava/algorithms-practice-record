package leetcode.contest.c6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrangeWordsTest {
    @Test
    public void arrage() throws Exception {

        assertEquals(1, new ArrangeWords().arrange(
                new String[] {
                        "abcd", "def", "fgh"
                }
        ));

        assertEquals(-1, new ArrangeWords().arrange(
                new String[] {
                        "abcd", "def", "fgh", "ikl"
                }
        ));

        assertEquals(1, new ArrangeWords().arrange(
                new String[] {
                        "lpt", "def", "fgh", "abcd", "hijkl",
                }
        ));

        assertEquals(1, new ArrangeWords().arrange(
                new String[] {
                        "ghij", "defg", "jkg", "abcd", "ghijg"
                }
        ));

    }

}