package lintcode;

import util.TreeUtil;
import util.TreeUtil.TreeNode;

/**
 * problem url: http://www.lintcode.com/zh-cn/problem/maximum-depth-of-binary-tree/?rand=true
 */
public class MaximumDepthOfBinaryTree {

    static int maxLen = 0;

    public static int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        maxLen = 0;
        visit(root, 0);
        return maxLen;
    }

    private static void visit(TreeNode node, int height) {
        if(node == null) {
            if(height > maxLen) {
                maxLen = height;
            }
        }else {
            visit(node.left, height + 1);
            visit(node.right, height + 1);
        }
    }

}
