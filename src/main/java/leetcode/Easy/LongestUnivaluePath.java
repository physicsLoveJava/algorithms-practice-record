package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/longest-univalue-path
 */
public class LongestUnivaluePath {

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(
                pass(root, root.val),
                Math.max(
                    longestUnivaluePath(root.left),
                    longestUnivaluePath(root.right))
                );
    }

    private int pass(TreeNode root, int val) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 0;
        }
        if(root.left == null) {
            return root.right.val == val ? passOneSide(root.right, val) + 1 : 0;
        }
        if(root.right == null) {
            return root.left.val == val ? passOneSide(root.left, val) + 1 : 0;
        }
        int count = 0;
        if(root.left.val == val) {
            count += passOneSide(root.left, val) + 1;
        }
        if(root.right.val == val) {
            count += passOneSide(root.right, val) + 1;
        }
        return count;
    }

    private int passOneSide(TreeNode root, int val) {
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 0;
        }
        if(root.left == null) {
            return root.right.val == val ? passOneSide(root.right, val) + 1 : 0;
        }
        if(root.right == null) {
            return root.left.val == val ? passOneSide(root.left, val) + 1 : 0;
        }
        int count = 0;
        if(root.left.val == val) {
            int left = passOneSide(root.left, val) + 1;
            if( left > count) {
                count =  left;
            }
        }
        if(root.right.val == val) {
            int right = passOneSide(root.right, val) + 1;
            if( right > count) {
                count =  right;
            }
        }
        return count;
    }

}
