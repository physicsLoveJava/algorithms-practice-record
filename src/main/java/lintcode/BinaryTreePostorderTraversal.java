package lintcode;

import util.TreeUtil.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * problem url: http://www.lintcode.com/zh-cn/problem/binary-tree-postorder-traversal/
 */
public class BinaryTreePostorderTraversal {

    public static List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) {
            return new ArrayList<Integer>();
        }
        List<Integer> list = new ArrayList<Integer>();
        visit(root, list);
        return list;
    }

    private static void visit(TreeNode root, List<Integer> list) {
        if(root == null) {
            return;
        }
        visit(root.left, list);
        visit(root.right, list);
        list.add(root.val);
    }

}
