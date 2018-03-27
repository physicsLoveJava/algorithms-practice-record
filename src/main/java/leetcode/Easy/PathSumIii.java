package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/path-sum-iii
 */
public class PathSumIii {

    public int pathSum(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        return nodeStart(root, sum)
         + pathSum(root.left, sum)
         + pathSum(root.right, sum);
    }

    private int nodeStart(TreeNode root, int sum) {
        if(root == null) {
            return 0;
        }
        int count = 0;
        if(root.val == sum) {
            count += 1;
        }
        return count + nodeStart(root.left, sum - root.val)
                + nodeStart(root.right, sum - root.val);
    }

}
