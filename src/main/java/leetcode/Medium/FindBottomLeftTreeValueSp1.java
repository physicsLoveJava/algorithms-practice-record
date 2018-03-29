package leetcode.Medium;

import util.adt.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Problem Url: https://leetcode.com/problems/find-bottom-left-tree-value
 */
public class FindBottomLeftTreeValueSp1 {

    public int findLeftMostNode(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.right != null)
                queue.add(root.right);
            if (root.left != null)
                queue.add(root.left);
        }
        return root.val;
    }

}
