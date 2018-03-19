package leetcode.Medium;

import org.junit.Test;
import util.adt.ListNode;

public class InsertionSortListTest {
    @Test
    public void insertionSortList() throws Exception {

        ListNode n1 = new ListNode(1, null);
        ListNode n2 = new ListNode(3, null);
        ListNode n3 = new ListNode(4, null);
        ListNode n4 = new ListNode(2, null);
        ListNode n5 = new ListNode(5, null);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(new InsertionSortList().insertionSortList(n1));
    }

}