package leetcode.Medium;

import org.junit.Test;

public class ThreeSumTest {
    @Test
    public void threeSum() throws Exception {

        System.out.println(new ThreeSum().threeSum(
                new int[]{
                        -1, 0, 1, 2, -1, -4
                }
        ));

        System.out.println(new ThreeSum().threeSum(
                new int[]{
                        1, 1, -2
                }
        ));

    }

}