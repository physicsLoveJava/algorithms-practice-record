package types.string;

import org.junit.Assert;
import org.junit.Test;

public class PowerStringTest {
    @Test
    public void repeat() throws Exception {
        Assert.assertEquals("abc", new PowerString().repeat("abcabcabc"));
        Assert.assertEquals("abcd", new PowerString().repeat("abcdabcdabcd"));
        Assert.assertEquals("abcd", new PowerString().repeat("abcdabcdabcdabcd"));
    }

}