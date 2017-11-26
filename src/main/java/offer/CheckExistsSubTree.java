package offer;

import util.adt.BinaryTreeNode;

public class CheckExistsSubTree {

    public static boolean check(BinaryTreeNode<Integer> mainTree, BinaryTreeNode<Integer> subTree) {
        if(mainTree == null || subTree == null) {
            return false;
        }
        return visit(mainTree, subTree);
    }

    private static boolean visit(BinaryTreeNode<Integer> node, BinaryTreeNode<Integer> subTree) {
        if(node == null) {
            return false;
        }
        return checkDetail(node, subTree) || visit(node.getLeft(), subTree) || visit(node.getRight(), subTree);
    }

    private static boolean checkDetail(BinaryTreeNode<Integer> main, BinaryTreeNode<Integer> sub) {
        if(main == null && sub == null) {
            return true;
        }
        if(main == null || sub == null) {
            return false;
        }
        return main.getData().equals(sub.getData())
                && checkDetail(main.getLeft(), sub.getLeft())
                && checkDetail(main.getRight(), sub.getRight());
    }

}
