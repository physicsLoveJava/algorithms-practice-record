package leetcode.Medium;

import util.adt.ListNode;

/**
 * Problem Url: https://leetcode.com/problems/partition-list
 */
public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode n1 = new ListNode(0);
        ListNode n2 = new ListNode(0);
        ListNode p1 = n1, p2 = n2;
        while(head != null) {
            if(head.val < x) {
                p1 = p1.next = head;
            }else {
                p2 = p2.next = head;
            }
            head = head.next;
        }
        p2.next = null;
        p1.next = n2.next;
        return n1.next;
    }

}
