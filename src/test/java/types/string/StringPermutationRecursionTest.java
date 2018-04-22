package types.string;

import org.junit.Test;

public class StringPermutationRecursionTest {
    @Test
    public void permutation() throws Exception {
        new StringPermutation().permutation(new int[]{1, 2, 3, 4});
    }

    @Test
    public void permutationWithRepeatCharacters() throws Exception {
        new StringPermutation().permutation(new int[]{1, 2, 2, 4});
    }

}