package leetcode.Medium;

import util.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Problem Url: https://leetcode.com/problems/binary-tree-preorder-traversal
 */
public class BinaryTreePreorderTraversalSp1 {

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<Integer> rs = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            rs.add(node.val);
            if(node.right != null) {
                stack.push(node.right);
            }
            if(node.left != null) {
                stack.push(node.left);
            }
        }
        return rs;
    }


}
