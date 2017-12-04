package offer;

import org.junit.Test;
import util.adt.BinaryTreeNode;

import static org.junit.Assert.*;

public class BinaryTreeToDoublyLinkedListTest {
    @Test
    public void convert() throws Exception {

        BinaryTreeNode root = new BinaryTreeNode(6);
        BinaryTreeNode left = new BinaryTreeNode(4);
        BinaryTreeNode right = new BinaryTreeNode(8);
        root.setLeft(left);
        root.setRight(right);

        System.out.println(root);
        BinaryTreeNode node = BinaryTreeToDoublyLinkedList.convert(root);
        BinaryTreeNode p = node;
        BinaryTreeNode q = node;
        while(p != null) {
            System.out.println(p.getData());
            q = p;
            p = p.getRight();
        }
        while(q != null) {
            System.out.println(q.getData());
            q = q.getLeft();
        }

    }

}