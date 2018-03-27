package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/convert-bst-to-greater-tree
 */
public class ConvertBstToGreaterTree {

    public TreeNode convertBST(TreeNode root) {
        if(root == null) {
            return null;
        }
        return convertBST(root, root);
    }

    private TreeNode convertBST(TreeNode node, TreeNode root) {
        if(node == null) {
            return null;
        }
        TreeNode newNode = new TreeNode(node.val + greaterKeysSum(root, node.val));
        newNode.left = convertBST(node.left, root);
        newNode.right = convertBST(node.right, root);
        return newNode;
    }

    private int greaterKeysSum(TreeNode root, int val) {
        if(root == null) {
            return 0;
        }
        if(root.val <= val) {
            return greaterKeysSum(root.right, val);
        }else {
            return root.val + greaterKeysSum(root.left, val) +greaterKeysSum(root.right, val);
        }
    }

}
