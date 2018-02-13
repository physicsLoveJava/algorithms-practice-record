package leetcode.hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergekSortedListsTest {

    @Test
    public void mergeKListsException() {
        assertEquals(null, MergekSortedLists.mergeKLists(new MergekSortedLists.ListNode[]{}));
    }

    @Test
    public void mergeKLists() throws Exception {

        MergekSortedLists.ListNode root1 = new MergekSortedLists.ListNode(1);
        MergekSortedLists.ListNode s1 = new MergekSortedLists.ListNode(3);
        MergekSortedLists.ListNode s2 = new MergekSortedLists.ListNode(5);
        MergekSortedLists.ListNode s3 = new MergekSortedLists.ListNode(7);

        root1.next = s1;
        s1.next = s2;
        s2.next = s3;
        s3.next = null;

        MergekSortedLists.ListNode root2 = new MergekSortedLists.ListNode(2);
        MergekSortedLists.ListNode t1 = new MergekSortedLists.ListNode(4);
        MergekSortedLists.ListNode t2 = new MergekSortedLists.ListNode(6);
        MergekSortedLists.ListNode t3 = new MergekSortedLists.ListNode(8);

        root2.next = t1;
        t1.next = t2;
        t2.next = t3;
        t3.next = null;


        MergekSortedLists.ListNode list = MergekSortedLists.mergeKLists(new MergekSortedLists.ListNode[]{
                root1,
                root2,
                null
        });

        while(list != null) {
            System.out.println(list.val);
            list = list.next;
        }

    }

}