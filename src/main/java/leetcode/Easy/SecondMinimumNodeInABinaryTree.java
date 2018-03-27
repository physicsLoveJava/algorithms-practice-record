package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/second-minimum-node-in-a-binary-tree
 */
public class SecondMinimumNodeInABinaryTree {

    int rs = Integer.MAX_VALUE;
    int min;

    public int findSecondMinimumValue(TreeNode root) {
        if(root == null) {
            return -1;
        }
        min = root.val;
        search(root);
        return rs == Integer.MAX_VALUE ? -1 : rs;
    }

    private void search(TreeNode root) {
        if(root == null) {
            return;
        }
        if(min < root.val && root.val < rs) {
            rs = root.val;
        }else if(min == root.val) {
            search(root.left);
            search(root.right);
        }
    }

}
