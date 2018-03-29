package lintcode;

import util.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * problem url: http://www.lintcode.com/zh-cn/problem/binary-tree-inorder-traversal/
 */
public class BinaryTreeInorderTraversal {

    public static List<Integer> inorderTraversal(TreeNode root) {
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
        list.add(root.val);
        visit(root.right, list);
    }

}
