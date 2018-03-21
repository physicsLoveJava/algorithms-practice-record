package leetcode.Medium;

import util.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Problem Url: https://leetcode.com/problems/binary-tree-inorder-traversal
 */
public class BinaryTreeInorderTraversalIterative {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rs = new ArrayList<>();
        if(root == null) {
            return rs;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(node.right != null) {
                stack.push(node.right);
            }
            if(node.left == null && node.right == null) {
                rs.add(node.val);
            }else {
                stack.push(new TreeNode(node.val));
            }
            if(node.left != null) {
                stack.push(node.left);
            }
        }
        return rs;
    }

}
