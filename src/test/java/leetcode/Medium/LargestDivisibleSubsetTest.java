package leetcode.Medium;

import org.junit.Test;

public class LargestDivisibleSubsetTest {
    @Test
    public void largestDivisibleSubset() throws Exception {

        System.out.println(new LargestDivisibleSubset().largestDivisibleSubset(
                new int[]{
                        1, 2, 3
                }
        ));

        System.out.println(new LargestDivisibleSubset().largestDivisibleSubset(
                new int[]{
                        1, 2, 4, 8
                }
        ));

        System.out.println(new LargestDivisibleSubset().largestDivisibleSubset(
                new int[]{
                        1, 2, 3, 4
                }
        ));

        System.out.println(new LargestDivisibleSubset().largestDivisibleSubset(
                new int[]{
                        2, 4, 6, 9, 19, 81, 729
                }
        ));

        System.out.println(new LargestDivisibleSubset().largestDivisibleSubset(
                new int[]{
                        2, 4, 9, 9, 19, 81, 729
                }
        ));

    }

}