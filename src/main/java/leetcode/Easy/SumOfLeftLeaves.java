package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/sum-of-left-leaves
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return sumOfLeftLeaves(root.left, root) + sumOfLeftLeaves(root.right, root);
    }

    private int sumOfLeftLeaves(TreeNode node, TreeNode parent) {
        if(node == null) {
            return 0;
        }
        if(node.left == null && node.right == null) {
            return parent.left == node ? node.val : 0;
        }
        return sumOfLeftLeaves(node.left, node) + sumOfLeftLeaves(node.right, node);
    }

}
