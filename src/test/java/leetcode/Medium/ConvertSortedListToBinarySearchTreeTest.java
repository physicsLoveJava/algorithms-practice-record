package leetcode.Medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertSortedListToBinarySearchTreeTest {
    @Test
    public void sortedListToBST() throws Exception {

        ConvertSortedListToBinarySearchTree.ListNode n1 = new ConvertSortedListToBinarySearchTree.ListNode(1);
        ConvertSortedListToBinarySearchTree.ListNode n2 = new ConvertSortedListToBinarySearchTree.ListNode(2);
        ConvertSortedListToBinarySearchTree.ListNode n3 = new ConvertSortedListToBinarySearchTree.ListNode(3);
        ConvertSortedListToBinarySearchTree.ListNode n4 = new ConvertSortedListToBinarySearchTree.ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        System.out.println(new ConvertSortedListToBinarySearchTree().sortedListToBST(n1));

    }

}