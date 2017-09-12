package util;

import lintcode.MaximumDepthOfBinaryTree;

public class TreeUtil {

    public static class TreeNode {
        public int val;
        public TreeNode left, right;

        public TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    public static TreeNode createNode(int val) {
        return new TreeNode(val);
    }

}
