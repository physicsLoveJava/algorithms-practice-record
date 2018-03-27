package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/invert-binary-tree
 */
public class InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        TreeNode tRight = invertTree(root.right);
        TreeNode tLeft = invertTree(root.left);
        root.left = tRight;
        root.right = tLeft;
        return root;
    }

}
