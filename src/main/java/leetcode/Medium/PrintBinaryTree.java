package leetcode.Medium;

import util.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/print-binary-tree
 */
public class PrintBinaryTree {

    public List<List<String>> printTree(TreeNode root) {
        if(root == null) {
            return new ArrayList<>();
        }
        int depth = findDepth(root);
        Integer[][] tree = new Integer[depth][(int) Math.pow(2, depth) - 1];
        construct(root, tree, 0, 0, tree[0].length - 1);
        return constructRs(tree);
    }

    private List<List<String>> constructRs(Integer[][] tree) {
        List<List<String>> rs = new ArrayList<>(tree.length);
        for (int i = 0; i < tree.length; i++) {
            List<String> subList = new ArrayList<>(tree[i].length);
            for (int j = 0; j < tree[i].length; j++) {
                subList.add(tree[i][j] == null ? "" : String.valueOf(tree[i][j]));
            }
            rs.add(subList);
        }
        return rs;
    }

    private void construct(TreeNode node, Integer[][] tree, int depth, int start, int end) {
        if(node == null) {
            return;
        }
        int mid = (start + end) >>> 1;
        tree[depth][mid] = node.val;
        construct(node.left, tree, depth + 1, start, mid - 1);
        construct(node.right, tree, depth + 1, mid + 1, end);
    }

    private int findDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(findDepth(root.left), findDepth(root.right));
    }

}
