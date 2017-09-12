package lintcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreePostorderTraversalTest {
    @Test
    public void postorderTraversal() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);
        assertEquals(list, BinaryTreePostorderTraversal.postorderTraversal(BaseBinaryTrase.create()));
    }

}