package leetcode.Medium;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder == null || postorder == null) {
            return null;
        }
        return buildTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private TreeNode buildTree(int[] inorder, int s1, int e1, int[] postorder, int s2, int e2) {
        if(s1 > e1 || s2 > e2 || e1 < 0 || e2 < 0) {
            return null;
        }
        int rootVal = postorder[e2];
        int midIdx = findIdx(inorder, s1, e1, rootVal);
        TreeNode node = new TreeNode(rootVal);
        node.left = buildTree(inorder, s1, midIdx - 1, postorder, s2, e2 - e1 + midIdx - 1);
        node.right = buildTree(inorder, midIdx + 1, e1, postorder, e2 - e1 + midIdx,e2 - 1);
        return node;
    }

    private int findIdx(int[] inorder, int s1, int e1, int rootVal) {
        for (int i = s1; i < e1; i++) {
            if(inorder[i] == rootVal) {
                return i;
            }
        }
        return -1;
    }

}
