package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeleteAndEarnTest {
    @Test
    public void deleteAndEarn() throws Exception {
        assertEquals(6, DeleteAndEarn.deleteAndEarn(new int[] {3 ,4 ,2}));
        assertEquals(9, DeleteAndEarn.deleteAndEarn(new int[] {2, 2, 3, 3, 3, 4}));
    }

    @Test
    public void deleteAndEarn2() {
        System.out.println(DeleteAndEarn.deleteAndEarn(new int[]{6, 9, 6, 7, 8, 10, 5, 2, 7, 2, 3, 1, 5, 5, 6, 10, 8, 6, 4, 10, 1, 6, 6, 7, 4, 3, 7, 9, 10, 2, 5, 9, 9, 8, 2, 10, 4, 2, 2, 5, 10, 6, 10, 1, 10, 4, 5, 1, 8, 6}));
    }

}