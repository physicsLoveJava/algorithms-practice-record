package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/binary-tree-tilt
 */
public class BinaryTreeTilt {

    public int findTilt(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int subTilt = findTilt(root.left) + findTilt(root.right);
        int diff = Math.abs(getValue(root.left) - getValue(root.right));
        return subTilt + diff;
    }

    private int getValue(TreeNode node) {
        if(node == null) {
            return 0;
        }
        return node.val + getValue(node.left) + getValue(node.right);
    }

}
