package offer;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FindTopKTest {
    @Test
    public void find() throws Exception {

        System.out.println(FindTopK.find(new int[]{1, 3, 2, 5, 6, 8, 4, 9, 7}, 4));

    }

    @Test
    public void findWithHeap() throws Exception {

        assertEquals(Arrays.toString(new int[]{6, 7, 8, 9}), FindTopK.findWithHeap(new int[]{1, 3, 2, 5, 6, 8, 4, 9, 7}, 4));

    }

}