package lintcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeInorderTraversalTest {
    @Test
    public void inorderTraversal() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        list.add(2);
        assertEquals(list, BinaryTreeInorderTraversal.inorderTraversal(BaseBinaryTrase.create()));
    }

}