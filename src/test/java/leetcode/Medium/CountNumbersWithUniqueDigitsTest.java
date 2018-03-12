package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountNumbersWithUniqueDigitsTest {
    @Test
    public void countNumbersWithUniqueDigits() throws Exception {

        assertEquals(1, new CountNumbersWithUniqueDigits()
                .countNumbersWithUniqueDigits(0));
        assertEquals(10, new CountNumbersWithUniqueDigits()
                .countNumbersWithUniqueDigits(1));
        assertEquals(91, new CountNumbersWithUniqueDigits()
                .countNumbersWithUniqueDigits(2));
        assertEquals(739, new CountNumbersWithUniqueDigits()
                .countNumbersWithUniqueDigits(3));
        assertEquals(5275, new CountNumbersWithUniqueDigits()
                .countNumbersWithUniqueDigits(4));

    }

}