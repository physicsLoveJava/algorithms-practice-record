package leetcode.Easy;

import org.junit.Test;
import util.adt.TreeNode;

import static org.junit.Assert.assertEquals;
import static util.TreeUtil.ofTree;

public class ConstructStringFromBinaryTreeTest {
    @Test
    public void tree2str() throws Exception {

        TreeNode root = ofTree(1,
                ofTree(2, ofTree(4)),
                ofTree(3));
        assertEquals("1(2(4))(3)", new ConstructStringFromBinaryTree().tree2str(root));

        TreeNode root1 = ofTree(1,
                ofTree(2, null, ofTree(4)),
                ofTree(3));
        assertEquals("1(2()(4))(3)", new ConstructStringFromBinaryTree().tree2str(root1));

    }

}