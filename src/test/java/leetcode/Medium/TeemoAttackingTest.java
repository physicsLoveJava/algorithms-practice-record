package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class TeemoAttackingTest {
    @Test
    public void findPoisonedDuration() throws Exception {

        assertEquals(4, new TeemoAttacking().findPoisonedDuration(
                new int[] {1, 4}, 2
        ));

        assertEquals(11, new TeemoAttacking().findPoisonedDuration(
                new int[] {1, 4, 8}, 4
        ));

    }

}