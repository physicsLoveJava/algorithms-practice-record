package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/construct-string-from-binary-tree
 */
public class ConstructStringFromBinaryTree {

    public String tree2str(TreeNode t) {
        if(t == null) {
            return "";
        }
        if(t.right == null && t.left == null) {
            return String.valueOf(t.val);
        }
        if(t.right == null) {
            return String.format("%s(%s)", t.val, tree2str(t.left));
        }
        return String.format("%s(%s)(%s)", t.val, tree2str(t.left), tree2str(t.right));
    }

}
