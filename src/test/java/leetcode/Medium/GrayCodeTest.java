package leetcode.Medium;

import org.junit.Test;

public class GrayCodeTest {
    @Test
    public void grayCode() throws Exception {

        System.out.println(new GrayCode().grayCode(4));

    }

    @Test
    public void grayCodeMethod() {
        System.out.println(15 ^ 15 >> 1);
    }

}