package leetcode.Medium;

import util.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Url: https://leetcode.com/problems/binary-tree-right-side-view
 */
public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rightSideView(root, res, 0);
        return res;
    }

    private void rightSideView(TreeNode node, List<Integer> res, int level) {
        if(node == null) {
            return;
        }
        if(res.size() - 1 < level) {
            res.add(node.val);
        }
        if(node.right != null) {
            rightSideView(node.right, res, level + 1);
        }
        if(node.left != null) {
            rightSideView(node.left, res, level + 1);
        }
    }

}
