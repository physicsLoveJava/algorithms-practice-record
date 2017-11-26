package offer;

import org.junit.Test;
import util.adt.BinaryTreeNode;

import static org.junit.Assert.*;
import static util.CopyUtils.setLeft;
import static util.CopyUtils.setRight;

public class BinaryTreeMirrorTest {
    @Test
    public void mirror() throws Exception {

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(5);

        setLeft(root, 3);
        setRight(root, 7);
        setLeft(root.getLeft(), 1);
        setRight(root.getLeft(), 2);
        setLeft(root.getRight(), 8);
        setRight(root.getRight(), 9);

        System.out.println(BinaryTreeMirror.mirror(root));

    }

}