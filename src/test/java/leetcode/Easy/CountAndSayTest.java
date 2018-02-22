package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountAndSayTest {
    @Test
    public void countAndSay() throws Exception {

        assertEquals("1", new CountAndSay().countAndSay(1));
        assertEquals("11", new CountAndSay().countAndSay(2));
        assertEquals("21", new CountAndSay().countAndSay(3));
        assertEquals("1211", new CountAndSay().countAndSay(4));
        assertEquals("111221", new CountAndSay().countAndSay(5));

    }

}