package leetcode.Easy;

import util.adt.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Problem Url: https://leetcode.com/problems/average-of-levels-in-binary-tree
 */
public class AverageOfLevelsInBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> rs = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        Queue<TreeNode> next = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            long num = 0, count = 0;
            while(!queue.isEmpty()) {
                TreeNode peek = queue.poll();
                num += peek.val;
                count++;
                if(peek.left != null) {
                    next.add(peek.left);
                }
                if(peek.right != null) {
                    next.add(peek.right);
                }
            }
            if(count != 0) {
                rs.add(num / (double) count);
            }
            queue.addAll(next);
            next.clear();
        }
        return rs;
    }

}
