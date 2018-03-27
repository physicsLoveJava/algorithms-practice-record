package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/trim-a-binary-search-tree
 */
public class TrimABinarySearchTree {

    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null) {
            return null;
        }
        if(root.val < L) {
            return trimBST(root.right, L, R);
        }
        if(root.val >= L && root.val <= R) {
            root.left = trimBST(root.left, L, R);
            root.right = trimBST(root.right, L, R);
            return root;
        }
        if(root.val > R) {
            return trimBST(root.left, L, R);
        }
        return null;
    }

}
