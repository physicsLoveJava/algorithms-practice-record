package leetcode.Easy;

import util.adt.TreeNode;

import java.util.*;

/**
 * Problem Url: https://leetcode.com/problems/binary-tree-level-order-traversal-ii
 */
public class BinaryTreeLevelOrderTraversalIi {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> rs = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        Queue<TreeNode> next = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()) {

            List<Integer> level = new ArrayList<>();
            while(!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if(node.left != null) {
                    next.add(node.left);
                }
                if(node.right != null) {
                    next.add(node.right);
                }
                level.add(node.val);
            }
            rs.add(level);
            queue.addAll(next);
            next.clear();
        }

        Collections.reverse(rs);
        return rs;
    }

}
