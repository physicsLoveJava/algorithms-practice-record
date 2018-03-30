package leetcode.Medium;

import util.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/path-sum-ii
 */
public class PathSumIi {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> rs = new ArrayList<>();
        dfs(root, rs, new ArrayList<>(), sum);
        return rs;
    }

    private void dfs(TreeNode node, List<List<Integer>> rs, List<Integer> sub, int sum) {
        if(node == null) {
            return;
        }
        if(node.left == null && node.right == null) {
            if(sum == node.val) {
                sub.add(node.val);
                rs.add(new ArrayList<>(sub));
                sub.remove(sub.size() - 1);
            }
            return;
        }
        sub.add(node.val);
        dfs(node.left, rs, sub, sum - node.val);
        dfs(node.right, rs, sub, sum - node.val);
        sub.remove(sub.size() - 1);
    }

}
