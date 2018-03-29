package lintcode;


import util.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * problem url: http://www.lintcode.com/zh-cn/problem/binary-tree-preorder-traversal/
 */
public class BinaryTreePreorderTraversal {

    public static List<Integer> preorderTraversal(TreeNode root) {
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
        list.add(root.val);
        visit(root.left, list);
        visit(root.right, list);
    }

}
