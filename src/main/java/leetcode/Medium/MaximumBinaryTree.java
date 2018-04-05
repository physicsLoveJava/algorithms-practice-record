package leetcode.Medium;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/maximum-binary-tree
 */
public class MaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructTree(nums, 0, nums.length - 1);
    }

    private TreeNode constructTree(int[] nums, int start, int end) {
        if(start > end) {
            return null;
        }
        int max = Integer.MIN_VALUE;
        int maxId = -1;
        for (int i = start; i <= end; i++) {
            if(max < nums[i]) {
                max = nums[i];
                maxId = i;
            }
        }
        TreeNode node = new TreeNode(max);
        node.left = constructTree(nums, start, maxId - 1);
        node.right = constructTree(nums, maxId + 1, end);
        return node;
    }

}
