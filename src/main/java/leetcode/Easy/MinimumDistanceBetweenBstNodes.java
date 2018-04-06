package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/minimum-distance-between-bst-nodes
 */
public class MinimumDistanceBetweenBstNodes {

    public int minDiffInBST(TreeNode root) {
        if(root == null) {
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;
        if(root.left != null) {
            int maxLeft = findMax(root.left);
            min = Math.min(Math.abs(maxLeft - root.val), min);
        }
        if(root.right != null) {
            int minRight = findMin(root.right);
            min = Math.min(Math.abs(minRight - root.val), min);
        }
        return Math.min(min,
                Math.min(
                        minDiffInBST(root.left),
                        minDiffInBST(root.right)
                ));
    }

    private int findMin(TreeNode node) {
        if(node.left == null) {
            return node.val;
        }
        return findMin(node.left);
    }

    private int findMax(TreeNode node) {
        if(node.right == null) {
            return node.val;
        }
        return findMax(node.right);
    }

}
