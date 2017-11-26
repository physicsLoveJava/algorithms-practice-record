package offer;

import org.junit.Test;

import static org.junit.Assert.*;
import static offer.CheckIfThePostOrderOfBinarySearchTree.isPostOrder;


public class CheckIfThePostOrderOfBinarySearchTreeTest {
    @Test
    public void isPostOrderTest() throws Exception {

        assertTrue(isPostOrder(new int[]{5, 7, 6, 9, 11, 10, 8}));
        assertFalse(isPostOrder(new int[]{5, 7, 6, 9, 4, 10, 8}));

    }

}