package leetcode.Medium;

import util.adt.ListNode;

/**
 * Problem Url: https://leetcode.com/problems/reorder-list
 */
public class ReorderList {

    public void reorderList(ListNode head) {
        if(head == null || head.next == null) {
            return ;
        }
        ListNode prev = null, slow = head, fast = head;
        while(fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode reverse = reverse(slow);
        merge(head, reverse);
    }

    private void merge(ListNode head, ListNode last) {
        if(head == null) {
            return ;
        }
        ListNode p1 = head, p2 = last, prev = null;
        while(p1 != null && p2 != null) {
            ListNode temp = p1.next;
            prev = p2;
            p1.next = p2;
            p2 = p2.next;
            p1.next.next = temp;
            p1 = p1.next.next;
        }
        if(p1 == null) {
            prev.next = p2;
        }
    }

    private ListNode reverse(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode res = null;
        ListNode p = head;
        while(p != null) {
            ListNode tmp = p.next;
            p.next = res;
            res = p;
            p = tmp;
        }
        return res;
    }

}
