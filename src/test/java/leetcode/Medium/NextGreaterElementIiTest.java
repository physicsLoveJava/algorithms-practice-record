package leetcode.Medium;

import org.junit.Test;

import java.util.Arrays;

public class NextGreaterElementIiTest {
    @Test
    public void nextGreaterElements() throws Exception {

        System.out.println(Arrays.toString(new NextGreaterElementIi().nextGreaterElements(new int[]{
                1, 2, 1
        })));

        System.out.println(Arrays.toString(new NextGreaterElementIi().nextGreaterElements(new int[]{
                4, 3, 5, 1, 9, 8, 2
        })));

        System.out.println(Arrays.toString(new NextGreaterElementIi().nextGreaterElements(new int[]{
                1, 2, 3, 4, 5, 6, 5, 4, 5, 1, 2, 3
        })));

    }

}