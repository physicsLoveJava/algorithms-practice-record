package lintcode;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import util.TreeUtil.TreeNode;

import static util.TreeUtil.createNode;

public class MaximumDepthOfBinaryTreeTest {

    TreeNode testNode1;

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
        TreeNode node5 = createNode(5);

        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;

        testNode1 = node1;
    }

    @Test
    public void test1() {
        Assert.assertEquals(3, MaximumDepthOfBinaryTree.maxDepth(testNode1));
    }

}