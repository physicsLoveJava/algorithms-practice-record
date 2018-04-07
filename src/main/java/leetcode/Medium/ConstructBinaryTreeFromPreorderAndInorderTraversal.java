package leetcode.Medium;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null) {
            return null;
        }
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int s1, int e1, int[] inorder, int s2, int e2) {
        if(s1 > e1 || s2 > e2) {
            return null;
        }
        int rootVal = preorder[s1];
        TreeNode node = new TreeNode(rootVal);
        int midIdx = findValueIdx(inorder, rootVal, s2, e2);
        node.left = buildTree(preorder, s1 + 1, s1 + midIdx - s2, inorder, s2, midIdx - 1);
        node.right = buildTree(preorder, s1 + midIdx - s2 + 1, e1, inorder, midIdx + 1, e2);
        return node;
    }

    private int findValueIdx(int[] inorder, int val, int s2, int e2) {
        for (int i = s2; i <= e2; i++) {
            if(inorder[i] == val) {
                return i;
            }
        }
        return -1;
    }

}
