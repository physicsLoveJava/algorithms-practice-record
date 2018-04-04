package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberComplementTest {
    @Test
    public void findComplement() throws Exception {
        assertEquals(2, new NumberComplement().findComplement(5));
        assertEquals(0, new NumberComplement().findComplement(1));
    }

}