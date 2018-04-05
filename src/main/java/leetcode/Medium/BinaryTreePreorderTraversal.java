package leetcode.Medium;

import util.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/binary-tree-preorder-traversal
 */
public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<Integer> rs = new ArrayList<>();
        preorder(rs, root);
        return rs;
    }

    private void preorder(List<Integer> rs, TreeNode root) {
        if(root == null) {
            return;
        }
        rs.add(root.val);
        preorder(rs, root.left);
        preorder(rs, root.right);
    }

}
