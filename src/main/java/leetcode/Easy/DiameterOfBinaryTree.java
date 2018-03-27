package leetcode.Easy;

import util.adt.TreeNode;

/**
 * Problem Url: https://leetcode.com/problems/diameter-of-binary-tree
 */
public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) {
            return 0;
        }
        System.out.println(width(root));
        return Math.max(
                pairPath(root),
                Math.max(
                        diameterOfBinaryTree(root.left),
                        diameterOfBinaryTree(root.right)
                )
        );
    }

    private int pairPath(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int lw = width(root.left);
        int rw = width(root.right);
        return lw + rw;
    }

    private int width(TreeNode node) {
        if(node == null) {
            return 0;
        }
        return Math.max(width(node.left), width(node.right)) + 1;
    }

}
