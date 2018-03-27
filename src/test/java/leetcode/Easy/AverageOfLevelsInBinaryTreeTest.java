package leetcode.Easy;

import org.junit.Test;
import util.adt.TreeNode;

public class AverageOfLevelsInBinaryTreeTest {
    @Test
    public void averageOfLevels() throws Exception {

        TreeNode root = ofTree(3,
                ofTree(9),
                ofTree(20,
                        ofTree(15),
                        ofTree(7)));

        System.out.println(new AverageOfLevelsInBinaryTree().averageOfLevels(root));

    }

    TreeNode ofTree(int val) {
        return new TreeNode(val);
    }

    TreeNode ofTree(int val, TreeNode left) {
        TreeNode node = ofTree(val);
        node.left = left;
        return node;
    }

    TreeNode ofTree(int val, TreeNode left, TreeNode right) {
        TreeNode node = ofTree(val);
        node.left = left;
        node.right = right;
        return node;
    }

}