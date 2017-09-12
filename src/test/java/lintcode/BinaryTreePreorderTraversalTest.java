package lintcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreePreorderTraversalTest {

    @Test
    public void preorderTraversal() throws Exception {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(list, BinaryTreePreorderTraversal.preorderTraversal(BaseBinaryTrase.create()));
    }

}