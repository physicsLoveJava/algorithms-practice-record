package util;

import util.adt.BinaryTreeNode;

public class CopyUtils {

    public static void setLeft(BinaryTreeNode<Integer> root, int value) {
        root.setLeft(new BinaryTreeNode<>(value));
    }

    public static void setRight(BinaryTreeNode<Integer> root, int value) {
        root.setRight(new BinaryTreeNode<>(value));
    }

}
