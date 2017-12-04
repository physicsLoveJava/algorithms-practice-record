package offer;

import util.adt.BinaryTreeNode;

public class BinaryTreeToDoublyLinkedList {

    public static BinaryTreeNode convert(BinaryTreeNode node) {
        return convertNode(node);
    }

    private static BinaryTreeNode convertNode(BinaryTreeNode node) {
        if(node == null) {
            return null;
        }
        BinaryTreeNode root = new BinaryTreeNode(node.getData());
        BinaryTreeNode left = convertNode(node.getLeft());
        BinaryTreeNode right = convertNode(node.getRight());
        BinaryTreeNode leftLast = findLast(left);
        connect(leftLast, root);
        connect(root, right);
        return findFirst(root);
    }

    private static BinaryTreeNode findFirst(BinaryTreeNode root) {
        if(root == null) {
            return null;
        }
        BinaryTreeNode p = root;
        BinaryTreeNode first = null;
        while(p != null) {
            first = p;
            p = p.getLeft();
        }
        return first;
    }

    private static void connect(BinaryTreeNode left, BinaryTreeNode right) {
        if(left == null || right == null) {
            return;
        }
        left.setRight(right);
        right.setLeft(left);
    }

    private static BinaryTreeNode findLast(BinaryTreeNode node) {
        if(node == null) {
            return null;
        }
        BinaryTreeNode p = node;
        BinaryTreeNode last = null;
        while(p != null) {
            last = p;
            p = p.getRight();
        }
        return last;
    }

}
