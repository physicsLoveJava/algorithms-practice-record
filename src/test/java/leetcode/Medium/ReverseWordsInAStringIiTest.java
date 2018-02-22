package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInAStringIiTest {
    @Test
    public void reverseStr() throws Exception {

        assertEquals("bacdfeg", new ReverseWordsInAStringIi().reverseStr(
                "abcdefg", 2
        ));

    }

}