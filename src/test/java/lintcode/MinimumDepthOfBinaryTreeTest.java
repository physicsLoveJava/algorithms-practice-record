package lintcode;

import org.junit.Before;
import org.junit.Test;
import util.TreeUtil;
import util.TreeUtil.TreeNode;

import static org.junit.Assert.*;
import static util.TreeUtil.createNode;

public class MinimumDepthOfBinaryTreeTest {

    TreeNode testNode1;
    TreeNode testNode2;

    /**
     *    1
     / \
     2   3
     / \
     4   5
     */
    @Before
    public void setUp() {
        TreeNode node1 = createNode(1);
        TreeNode node2 = createNode(2);
        TreeNode node3 = createNode(3);
        TreeNode node4 = createNode(4);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;

        testNode1 = node1;

        testNode2 = createNode(1);
    }

    @Test
    public void test1() throws Exception {
        assertEquals(2, MinimumDepthOfBinaryTree.minDepth(testNode1));
    }

    @Test
    public void test2() {
        assertEquals(1, MinimumDepthOfBinaryTree.minDepth(testNode2));
    }

}