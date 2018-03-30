package leetcode.Medium;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/house-robber-iii
 */
public class HouseRobberIii {

    public int rob(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int val = 0;
        if(root.left != null) {
            val += rob(root.left.left) + rob(root.left.right);
        }
        if(root.right != null) {
            val += rob(root.right.left) + rob(root.right.right);
        }
        return Math.max(root.val + val, rob(root.left) + rob(root.right));
    }

}
