package offer;

import org.junit.Test;
import util.adt.BinaryTreeNode;

import static org.junit.Assert.*;
import static util.CopyUtils.setLeft;
import static util.CopyUtils.setRight;

public class BinaryPathValueTest {
    @Test
    public void printPaths() throws Exception {

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);

        setLeft(root, 3);
        setRight(root, 2);
        setLeft(root.getLeft(), 1);
        setRight(root.getLeft(), 2);
        setLeft(root.getRight(), 2);
        setRight(root.getRight(), 1);

        BinaryPathValue.printPaths(root, 9);
        BinaryPathValue.printPaths(root, 10);
        BinaryPathValue.printPaths(root, 11);

    }


}