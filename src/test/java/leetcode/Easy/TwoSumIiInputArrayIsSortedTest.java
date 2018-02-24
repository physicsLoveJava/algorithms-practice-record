package leetcode.Easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumIiInputArrayIsSortedTest {
    @Test
    public void twoSum() throws Exception {

        assertArrayEquals(new int[] {
                1, 2
        }, new TwoSumIiInputArrayIsSorted().twoSum(
                new int[] {
                        2, 7, 11, 15
                },
                9
        ));

        assertArrayEquals(new int[] {
                1, 2
        }, new TwoSumIiInputArrayIsSorted().twoSum(
                new int[] {
                        3, 4
                },
                7
        ));

        assertArrayEquals(new int[] {
                2, 3
        }, new TwoSumIiInputArrayIsSorted().twoSum(
                new int[] {
                        1, 3, 4
                },
                7
        ));

    }

}