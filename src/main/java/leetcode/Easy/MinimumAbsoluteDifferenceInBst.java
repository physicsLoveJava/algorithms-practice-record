package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/minimum-absolute-difference-in-bst
 */
public class MinimumAbsoluteDifferenceInBst {

    public int getMinimumDifference(TreeNode root) {
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
                        getMinimumDifference(root.left),
                        getMinimumDifference(root.right)
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
