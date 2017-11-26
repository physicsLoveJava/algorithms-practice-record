package offer;

import org.junit.Test;
import util.adt.BinaryTreeNode;

import static org.junit.Assert.*;
import static util.CopyUtils.setLeft;
import static util.CopyUtils.setRight;

public class CheckExistsSubTreeTest {

    @Test
    public void check() throws Exception {

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);
        setLeft(root, 7);
        setRight(root, 9);
        setLeft(root.getRight(), 10);
        setRight(root.getRight(), 8);
        setLeft(root.getRight().getRight(), 7);
        setRight(root.getRight().getRight(), 11);

        BinaryTreeNode<Integer> goodSubTree = new BinaryTreeNode<>(8);
        setLeft(goodSubTree, 7);
        setRight(goodSubTree, 11);

        BinaryTreeNode<Integer> badSubTree = new BinaryTreeNode<>(8);
        setLeft(badSubTree, 7);
        setRight(badSubTree, 12);

        assertTrue(CheckExistsSubTree.check(root, goodSubTree));
        assertFalse(CheckExistsSubTree.check(root, badSubTree));

    }

}