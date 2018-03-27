package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/two-sum-iv-input-is-a-bst
 */
public class TwoSumIvInputIsABst {

    public boolean findTarget(TreeNode root, int k) {
        if(root == null) {
            return false;
        }
        return findTarget(root, root, k);
    }

    private boolean findTarget(TreeNode t1, TreeNode t2, int k) {
        if(t1 == null || t2 == null) {
            return false;
        }
        int count = t1.val + t2.val;
        if(t1 != t2 && count == k) {
            return true;
        }
        if(count > k) {
            return
                findTarget(t1, t2.left, k)
                || findTarget(t1.left, t2, k);
        }else if(count < k) {
            return
                findTarget(t1, t2.right, k)
                || findTarget(t1.right, t2, k);
        }else {
            return findTarget(t1.left, t2.right, k);
        }
    }

}
