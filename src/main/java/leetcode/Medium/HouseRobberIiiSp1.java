package leetcode.Medium;

import util.adt.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/house-robber-iii
 */
public class HouseRobberIiiSp1 {

    public int rob(TreeNode root) {
        return robSub(root, new HashMap<>());
    }

    private int robSub(TreeNode node, Map<TreeNode, Integer> map) {
        if(node == null) {
            return 0;
        }
        if(map.containsKey(node)) {
            return map.get(node);
        }
        int val = 0;
        if(node.left != null) {
            val += robSub(node.left.left, map) + robSub(node.left.right, map);
        }
        if(node.right != null) {
            val += robSub(node.right.left, map) + robSub(node.right.right, map);
        }
        int max = Math.max(node.val + val, robSub(node.left, map) + robSub(node.right, map));
        map.put(node, max);
        return max;
    }

}
