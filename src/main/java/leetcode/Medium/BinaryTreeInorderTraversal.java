package leetcode.Medium;

import util.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/binary-tree-inorder-traversal
 */
public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> rs = new ArrayList<>();
        recursive(root, rs);
        return rs;
    }

    private void recursive(TreeNode root, ArrayList<Integer> list) {
        if(root == null) {
            return ;
        }
        recursive(root.left, list);
        list.add(root.val);
        recursive(root.right, list);
    }

}
