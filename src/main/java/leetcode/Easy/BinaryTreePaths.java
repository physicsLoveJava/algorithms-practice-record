package leetcode.Easy;

import util.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/binary-tree-paths
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    private void dfs(TreeNode root, List<String> list) {
        if(root == null) {
            return;
        }
        String val = root.val + "";
        if(root.left == null && root.right == null) {
            list.add(val);
            return;
        }
        dfs(root.left, list, val);
        dfs(root.right, list, val);
    }

    private void dfs(TreeNode node, List<String> list, String cur) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            list.add(cur + "->" + node.val);
            return;
        }
        dfs(node.left, list, cur + "->" + node.val);
        dfs(node.right, list, cur + "->" + node.val);
    }

}
