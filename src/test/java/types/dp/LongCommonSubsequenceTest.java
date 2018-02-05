package types.dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongCommonSubsequenceTest {
    @Test
    public void find() throws Exception {

        assertEquals(4, LongCommonSubsequence.find(
                "abcdefg", "bcxdyeklli"
        ));

    }

}