package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void toClassName() throws Exception {
        assertEquals("ABC", StringUtil.toClassName("a-b-c", "-"));
        assertEquals("AbC", StringUtil.toClassName("ab*c", "*"));
        assertEquals("AxBxCx", StringUtil.toClassName("ax--bx--cx", "--"));
    }

}