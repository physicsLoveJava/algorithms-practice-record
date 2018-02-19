package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueSubstringsInWraparoundStringTest {
    @Test
    public void findSubstringInWraproundString() throws Exception {

        assertEquals(1, UniqueSubstringsInWraparoundString.findSubstringInWraproundString("a"));
        assertEquals(2, UniqueSubstringsInWraparoundString.findSubstringInWraproundString("cac"));
        assertEquals(6, UniqueSubstringsInWraparoundString.findSubstringInWraproundString("zab"));
        assertEquals(6, UniqueSubstringsInWraparoundString.findSubstringInWraproundString("abc"));
        assertEquals(6, UniqueSubstringsInWraparoundString.findSubstringInWraproundString("abcabc"));
        assertEquals(10, UniqueSubstringsInWraparoundString.findSubstringInWraproundString("abcabcd"));
        assertEquals(6, UniqueSubstringsInWraparoundString.findSubstringInWraproundString("zaba"));

    }

}