package leetcode.Easy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MoveZeroesTest {
    @Test
    public void moveZeroes() throws Exception {

        int[] arr = {
                1, 0, 3, 0, 11
        };
        new MoveZeroes().moveZeroes(arr);

        Assert.assertArrayEquals(new int[] {
                1, 3, 11, 0, 0
        }, arr);
    }

}