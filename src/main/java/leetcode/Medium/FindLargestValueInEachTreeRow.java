package leetcode.Medium;

import util.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/find-largest-value-in-each-tree-row
 */
public class FindLargestValueInEachTreeRow {

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, 0, list);
        return list;
    }

    private void dfs(TreeNode root, int level, List<Integer> list) {
        if(root == null) {
            return;
        }
        if(list.size() == level) {
            list.add(root.val);
        }else {
            Integer val = list.get(level);
            if(val < root.val) {
                list.set(level, root.val);
            }
        }
        dfs(root.left, level + 1, list);
        dfs(root.right, level + 1, list);
    }

}
