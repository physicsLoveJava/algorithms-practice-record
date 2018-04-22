package types.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotateStringTest {
    @Test
    public void rotate() throws Exception {
        assertEquals("cdefgab", new RotateString().rotate("abcdefg", 2));
    }

}