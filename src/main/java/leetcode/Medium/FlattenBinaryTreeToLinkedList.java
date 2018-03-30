package leetcode.Medium;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/flatten-binary-tree-to-linked-list
 */
public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        if(root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);
        TreeNode tmp = root.right;
        if(root.left != null) {
            root.right = root.left;
            root.left = null;
        }else {
            return;
        }
        TreeNode p = root.right;
        while(p != null && p.right != null) {
            p = p.right;
        }
        p.right = tmp;
    }

}
