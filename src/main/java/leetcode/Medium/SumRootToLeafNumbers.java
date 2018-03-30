package leetcode.Medium;

import util.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/sum-root-to-leaf-numbers
 */
public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        if(root == null) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        dfs(root, list, 0);
        int count = 0;
        for (Integer item : list) {
            count += item;
        }
        return count;
    }

    private void dfs(TreeNode node, List<Integer> list, Integer sub) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            list.add(sub * 10 + node.val);
            return;
        }
        dfs(node.left, list, sub * 10 + node.val);
        dfs(node.right, list, sub * 10 + node.val);
    }

}
