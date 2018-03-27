package leetcode.Easy;

import org.junit.Test;
import util.adt.TreeNode;

import static util.TreeUtil.ofTree;

public class DiameterOfBinaryTreeTest {
    @Test
    public void diameterOfBinaryTree() throws Exception {

        TreeNode root = ofTree(1,
                ofTree(2, ofTree(4), ofTree(5)),
                ofTree(3));

        System.out.println(new DiameterOfBinaryTree().diameterOfBinaryTree(root));

    }

}