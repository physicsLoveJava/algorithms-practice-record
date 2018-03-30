package leetcode.Medium;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/house-robber-iii
 */
public class HouseRobberIiiSp2 {

    public int rob(TreeNode root) {
        int[] res = robx(root);
        return Math.max(res[0], res[1]);
    }

    private int[] robx(TreeNode root) {
        if(root == null) {
            return new int[2];
        }
        int[] res = new int[2];
        int[] left = robx(root.left);
        int[] right = robx(root.right);

        res[0] = root.val + left[1] + right[1];
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return res;
    }

}
