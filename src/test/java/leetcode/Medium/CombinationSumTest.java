package leetcode.Medium;

import org.junit.Test;

public class CombinationSumTest {
    @Test
    public void combinationSum() throws Exception {

        System.out.println(new CombinationSum().combinationSum(
                new int[]{
                        2, 3, 6, 7
                }, 7
        ));

        //distinct ensure!
//        System.out.println(new CombinationSum().combinationSum(
//                new int[]{
//                        2, 2, 3, 6, 7
//                }, 7
//        ));

    }

}