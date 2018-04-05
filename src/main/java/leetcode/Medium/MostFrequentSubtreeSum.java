package leetcode.Medium;

import util.adt.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem Url: https://leetcode.com/problems/most-frequent-subtree-sum
 */
public class MostFrequentSubtreeSum {

    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        findFrequentTree(root, map);
        int max = 0, count = 0;
        for (Integer val : map.values()) {
            if(val > max) {
                max = val;
                count = 1;
            }else if(val == max) {
                count++;
            }
        }
        int[] rs = new int[count];
        int idx = 0;
        for (Integer key : map.keySet()) {
            if(map.get(key) == max) {
                rs[idx++] = key;
            }
        }
        return rs;
    }

    private void findFrequentTree(TreeNode root, Map<Integer, Integer> map) {
        if(root == null) {
            return;
        }
        putIn(map, findSubTreeValues(root));
        findFrequentTree(root.left, map);
        findFrequentTree(root.right, map);
    }

    private Integer findSubTreeValues(TreeNode node) {
        if(node == null) {
            return 0;
        }
        return node.val + findSubTreeValues(node.left) + findSubTreeValues(node.right);
    }

    private void putIn(Map<Integer, Integer> map, int val) {
        if(!map.containsKey(val)) {
            map.put(val, 0);
        }
        map.put(val, map.get(val) + 1);
    }

}
