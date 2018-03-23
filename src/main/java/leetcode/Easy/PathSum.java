package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/path-sum
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        return hasPathSumX(root, sum);
    }

    private boolean hasPathSumX(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null && sum == root.val) {
            return true;
        }
        return hasPathSumX(root.left, sum - root.val)
                || hasPathSumX(root.right, sum - root.val);
    }

}
