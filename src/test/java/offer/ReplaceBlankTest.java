package offer;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceBlankTest {
    @Test
    public void replace() throws Exception {
        assertEquals("%20", ReplaceBlank.replace(" "));
        assertEquals("abc", ReplaceBlank.replace("abc"));
        assertEquals("hello%20world", ReplaceBlank.replace("hello world"));
    }

}